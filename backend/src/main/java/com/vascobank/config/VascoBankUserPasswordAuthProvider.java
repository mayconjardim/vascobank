package com.vascobank.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import com.vascobank.entities.User;
import com.vascobank.repositories.UserRepository;

@Component
public class VascoBankUserPasswordAuthProvider implements AuthenticationProvider {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	   @Override
	    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
	        String username = authentication.getName();
	        String password = authentication.getCredentials().toString();
	        List<User> user = userRepository.findByEmail(username);
	        if (user.size() > 0) {
	            if (passwordEncoder.matches(password, user.get(0).getPassword())) {
	                List<GrantedAuthority> authorities = new ArrayList<>();
	                authorities.add(new SimpleGrantedAuthority(user.get(0).getRole()));
	                return new UsernamePasswordAuthenticationToken(username, password, authorities);
	            } else {
	                throw new BadCredentialsException("Senha invalida!");
	            }
	        }else {
	            throw new BadCredentialsException("Usuario não encontrado!");
	        }
	    }

	    @Override
	    public boolean supports(Class<?> authentication) {
	        return (UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication));
	    }

	}