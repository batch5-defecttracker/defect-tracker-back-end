package com.defect.tracker.services;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.defect.tracker.data.dto.LoginDto;
import com.defect.tracker.data.entities.Login;
import com.defect.tracker.data.mapper.Mapper;
import com.defect.tracker.data.repositories.LoginRepository;

@Service
public class LoginServiceImpl implements LoginService {

	private static final int EXPIRE_TOKEN_AFTER_MINUTES = 2;
	@Autowired
	private LoginRepository loginRepository;

	@Autowired
	Mapper mapper;

	@Autowired
	MailServiceImpl mailServiceImpl;

	@Override
	public List<Login> getEmployee(String status) {

		return loginRepository.getByStatus(status);

	}

	@Override
	public List<Login> getLoginByStatus(String status) {
		return loginRepository.findByStatus(status);
	}

	@Override
	public void updateEmployeeStatus(String email, String status) {
		Login login = loginRepository.findByEmail(email).get();
		LoginDto loginDto = mapper.map(login, LoginDto.class);
		loginDto.setStatus(status);
		login = mapper.map(loginDto, Login.class);
		loginRepository.save(login);
	}

	@Override
	public boolean isEmailAlreadyExist(String email) {
		return loginRepository.existsByEmail(email);
	}

	public String forgotPassword(String email) {

		Optional<Login> loginOptional = loginRepository.findByEmail(email);

		if (!loginOptional.isPresent()) {
			return "Invalid email id.";
		}

		Login login = loginOptional.get();
		login.setToken(generateToken());
		login.setTokenCreationDate(LocalDateTime.now());
		loginRepository.save(login);

		mailServiceImpl.sendForgotEmail(login.getEmail(), login.getToken());
		return login.getToken();
	}

	public String resetPassword(String token, String password) {

		Optional<Login> loginOptional = Optional.ofNullable(loginRepository.findByToken(token));

		if (!loginOptional.isPresent()) {
			return "Invalid token.";
		}

		LocalDateTime tokenCreationDate = loginOptional.get().getTokenCreationDate();

		if (isTokenExpired(tokenCreationDate)) {
			return "Token expired.";

		}

		Login login = loginOptional.get();
		login.setPassword(password);
		login.setToken(null);
		login.setTokenCreationDate(null);

		loginRepository.save(login);

		return "Your password successfully updated.";
	}

	private String generateToken() {
		StringBuilder token = new StringBuilder();

		return token.append(UUID.randomUUID().toString()).append(UUID.randomUUID().toString()).toString();
	}

	private boolean isTokenExpired(final LocalDateTime tokenCreationDate) {

		LocalDateTime now = LocalDateTime.now();
		Duration diff = Duration.between(tokenCreationDate, now);

		return diff.toMinutes() >= EXPIRE_TOKEN_AFTER_MINUTES;
	}

}
