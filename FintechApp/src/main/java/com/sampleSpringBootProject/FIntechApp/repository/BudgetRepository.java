package com.sampleSpringBootProject.FIntechApp.repository;

import com.sampleSpringBootProject.FIntechApp.model.Budget;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BudgetRepository extends JpaRepository<Budget, Long> {
    List<Budget> findByUserId(Long userId);
}