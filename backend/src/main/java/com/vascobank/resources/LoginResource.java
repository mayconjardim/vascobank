package com.vascobank.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vascobank.entities.User;
import com.vascobank.repositories.UserRepository;

@RestController
public class LoginResource {

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	@Autowired
	private UserRepository userRepository;


    @PostMapping("/registro")
    public ResponseEntity<String> cadastraUser(@RequestBody User user) {
        User savedUser = null;
        ResponseEntity<String> response = null;
        try {
            String hashPwd = passwordEncoder.encode(user.getPassword());
            user.setPassword(hashPwd);
            savedUser = userRepository.save(user);
            if (savedUser.getId() > 0) {
                response = ResponseEntity
                        .status(HttpStatus.CREATED)
                        .body("Usuario registrado com sucesso! ");
            }
        } catch (Exception ex) {
            response = ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Erro ao cadastrar usuario: " + ex.getMessage());
        }
        return response;
    }

    @RequestMapping("/user")
    public User getUserDetalhesAposLogin(Authentication authentication) {
        List<User> users = userRepository.findByEmail(authentication.getName());
        if (users.size() > 0) {
            return users.get(0);
        } else {
            return null;
        }

    }
    
    
}
