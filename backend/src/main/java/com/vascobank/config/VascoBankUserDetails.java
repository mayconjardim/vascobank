package com.vascobank.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.vascobank.entities.User;
import com.vascobank.repositories.UserRepository;

@Service
public class VascoBankUserDetails implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;

	String userName, password = null;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		List<GrantedAuthority> authorities = null;
		List<User> user = userRepository.findByEmail(username);
		if (user.size() == 0) {
			throw new UsernameNotFoundException("Usuario não encontrado: " + username);
		} else {
			userName = user.get(0).getEmail();
			password = user.get(0).getPassword();
			authorities = new ArrayList<>();
			authorities.add(new SimpleGrantedAuthority(user.get(0).getRole()));
		}
		return new org.springframework.security.core.userdetails.User(username, password, authorities);
	}

}
