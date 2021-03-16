package com.defect.tracker.services;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.defect.tracker.data.entities.Login;
import com.defect.tracker.data.repositories.LoginRepository;

import ch.qos.logback.core.util.Duration;

@Service
public class LoginServiceImpl implements LoginService {
	private static final int EXPIRE_TOKEN_AFTER_MINUTES = 1;
	@Autowired LoginRepository loginRepository;

	@Override
	public List<Login> getEmployee(String status) {
		
		return loginRepository.getByStatus(status);
	
	}
	
	public String forgotPassword(String email) {

		Optional<Login> loginOptional = Optional
				.ofNullable(loginRepository.findByEmail(email));

		if (!loginOptional.isPresent()) {
			return "Invalid email id.";
		}

		Login login = loginOptional.get();
		login.setToken(generateToken());
		login.setTokenCreationDate(LocalDateTime.now());

		login = loginRepository.save(login);

		return login.getToken();
	}

	public String resetPassword(String token, String password) {

		Optional<Login> loginOptional = Optional.ofNullable(loginRepository.findByToken(token));

		if (!loginOptional.isPresent()) {
			return "Invalid token.";
		}

		LocalDateTime tokenCreationDate = loginOptional.get().getTokenCreationDate();

//		if (isTokenExpired(tokenCreationDate)) {
//			return "Token expired.";
//
//		}

		Login login = loginOptional.get();

		login.setPassword(password);
		login.setToken(null);
		login.setTokenCreationDate(null);

		loginRepository.save(login);

		return "Your password successfully updated.";
	}

	/**
	 * Generate unique token. You may add multiple parameters to create a strong
	 * token.
	 * 
	 * @return unique token
	 */
	private String generateToken() {
		StringBuilder token = new StringBuilder();

		return token.append(UUID.randomUUID().toString())
				.append(UUID.randomUUID().toString()).toString();
	}

	/**
	 * Check whether the created token expired or not.
	 * 
	 * @param tokenCreationDate
	 * @return true or false
	 */
//	private boolean isTokenExpired(final LocalDateTime tokenCreationDate) {
//
//		LocalDateTime now = LocalDateTime.now();
//		Duration diff = Duration.between(tokenCreationDate, now);
//
//		return diff.toMinutes() >= EXPIRE_TOKEN_AFTER_MINUTES;
//	}

	
	
	
	

}
