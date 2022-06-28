package com.song.MegaSenaAPI;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class ApplicationSecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Override
    protected void configure(HttpSecurity http) throws Exception {
		
		http.authorizeHttpRequests()
		.anyRequest()
		.authenticated()
		.and()
		.httpBasic();
	
	} 
	
}
