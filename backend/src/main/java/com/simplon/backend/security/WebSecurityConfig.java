package com.simplon.backend.security;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.simplon.backend.security.implservice.UserDetailsServiceImpl;
//import com.simplon.backend.security.jwt.AuthEntryPointJwt;
//import com.simplon.backend.security.jwt.AuthTokenFilter;

@Configuration
//@EnableMethodSecurity
public class WebSecurityConfig {
	@Autowired
	UserDetailsServiceImpl userServiceImpl;
	/*
	@Autowired
	private AuthEntryPointJwt unauthorizedHandler;
	
	@Bean
	public AuthTokenFilter authenticationJwtTokenFilter() {
	    return new AuthTokenFilter();
	}*/
	/*
	@Bean
	public DaoAuthentificationProvider authentificationProvider() {
		DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
	       
	     authProvider.setUserServiceImpl(UserServiceImpl);
	     authProvider.setPasswordEncoder(passwordEncoder());
	   
	     return authProvider;
	}
	
	  @Bean
	  public AuthenticationManager authenticationManager(AuthenticationConfiguration authConfig) throws Exception {
	    return authConfig.getAuthenticationManager();
	  }

	  @Bean
	  public PasswordEncoder passwordEncoder() {
	    return new BCryptPasswordEncoder();
	  }
	  
	  @Bean
	  public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
	    http.csrf(csrf -> csrf.disable())
	        .exceptionHandling(exception -> exception.authenticationEntryPoint(unauthorizedHandler))
	        .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
	        .authorizeHttpRequests(auth -> 
	          auth.requestMatchers("/api/auth/**").permitAll()
	              .requestMatchers("/api/test/**").permitAll()
	              .anyRequest().authenticated()
	        );
	    
	    http.authenticationProvider(authenticationProvider());

	    http.addFilterBefore(authenticationJwtTokenFilter(), UsernamePasswordAuthenticationFilter.class);
	    
	    return http.build();
	  }*/
}
