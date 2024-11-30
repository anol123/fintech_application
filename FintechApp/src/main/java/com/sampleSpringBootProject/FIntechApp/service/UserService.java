package com.sampleSpringBootProject.FIntechApp.service;

import com.sampleSpringBootProject.FIntechApp.model.User;
import com.sampleSpringBootProject.FIntechApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User registerUser(User user) {
        // Add password hashing here (e.g., BCryptPasswordEncoder)
        return userRepository.save(user);
    }
}
