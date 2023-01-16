package com.vascobank.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vascobank.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	List<User> findByEmail(String email);

}
