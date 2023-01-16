package com.vascobank.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

	@Bean
	SecurityFilterChain SecurityFilterChain(HttpSecurity http) throws Exception {
		
		http.authorizeHttpRequests()
			.requestMatchers("/contas", "/saldos","/emprestimos","/cartoes").authenticated()
			.requestMatchers("/noticias", "/contatos").permitAll()
			.and().formLogin()
			.and().httpBasic();
	
			return http.build();	
	}
	
	
	
	
}
