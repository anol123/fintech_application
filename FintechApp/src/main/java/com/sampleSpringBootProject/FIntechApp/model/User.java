package com.sampleSpringBootProject.FIntechApp.model;

import jakarta.persistence.*;
import jakarta.validation.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
public class User {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Column(nullable = false, unique = true)
//    private String username;
//    private String email;
//
//    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<Budget> budgets = new ArrayList<>();
//
//    // Convenience method to add a budget
//    public void addBudget(Budget budget) {
//        budgets.add(budget);
//        budget.setUser(this);
//    }
//
//    // Convenience method to remove a budget
//    public void removeBudget(Budget budget) {
//        budgets.remove(budget);
//        budget.setUser(null);
//    }
//
//    // Getters and setters
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return username;
//    }
//
//    public void setName(String username) {
//        this.username = username;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public List<Budget> getBudgets() {
//        return budgets;
//    }
//
//    public void setBudgets(List<Budget> budgets) {
//        this.budgets = budgets;
//    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name is required")
    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters")
    private String name;

    @Email(message = "Invalid email address")
    @NotBlank(message = "Email is required")
    @Column(unique = true, nullable = false)
    private String email;

    @NotBlank(message = "Password is required")
    @Size(min = 6, message = "Password must be at least 6 characters long")
    private String password;

    // Constructors, Getters, and Setters
    public User() {}

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
