package com.springboot.registration.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.springboot.registration.model.User;
import com.springboot.registration.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);

}
