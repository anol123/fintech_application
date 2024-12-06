package com.sampleSpringBootProject.FIntechApp.repository;

import com.sampleSpringBootProject.FIntechApp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

//public interface UserRepository extends JpaRepository<User, Long> {
//    Optional<User> findByUsername(String username);
//}

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}