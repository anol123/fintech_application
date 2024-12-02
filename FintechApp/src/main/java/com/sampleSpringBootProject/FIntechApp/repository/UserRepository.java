package com.sampleSpringBootProject.FIntechApp.repository;

import com.sampleSpringBootProject.FIntechApp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}