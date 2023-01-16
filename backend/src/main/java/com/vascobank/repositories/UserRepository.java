package com.vascobank.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vascobank.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
