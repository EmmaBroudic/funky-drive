package com.simplon.backend.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplon.backend.services.JWTService;

@RestController
@RequestMapping("/auth")
public class LoginController {
	
	public JWTService jwtService;
	
	public LoginController(JWTService jwtService) {
		this.jwtService = jwtService;
	}

	@PostMapping("/login")
	public String getToken(Authentication authentication) {
        		String token = jwtService.generateToken(authentication);
        		return token;
	}
}