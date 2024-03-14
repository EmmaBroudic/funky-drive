package com.simplon.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplon.backend.payload.request.LoginRequest;
import com.simplon.backend.payload.response.JwtResponse;
import com.simplon.backend.repository.UserRepository;
import com.simplon.backend.security.implservice.UserDetailsImpl;
import com.simplon.backend.security.jwt.JwtUtils;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/auth")
public class AuthController {
	@Autowired
	AuthenticationManager authenticationManager;
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
	 @Autowired
	 JwtUtils jwtUtils;
	 
	 @PostMapping("/signin")
	  public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest) {
		 Authentication authentication = authenticationManager
			        .authenticate(new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));
		 
		 SecurityContextHolder.getContext().setAuthentication(authentication);
		    String jwt = jwtUtils.generateJwtToken(authentication);
		    
		 UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();

		 return ResponseEntity
		     .ok(new JwtResponse(jwt, userDetails.getId(), userDetails.getUsername(), userDetails.getEmail()));
	 }
}
