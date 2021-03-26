package com.defect.tracker.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.defect.tracker.data.entities.Login;
import com.defect.tracker.data.repositories.LoginRepository;

@Service
public class MyLoginDetailsService implements UserDetailsService{

	@Autowired
	LoginRepository loginRepository;
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		Optional<Login> user =loginRepository.findByEmail(email);
		user.orElseThrow(() -> new UsernameNotFoundException("Not found: "+email));
		return user.map(LoginDetails::new).get();
	}

}
