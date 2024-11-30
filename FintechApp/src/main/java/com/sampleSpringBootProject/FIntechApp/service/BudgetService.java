package com.sampleSpringBootProject.FIntechApp.service;

import com.sampleSpringBootProject.FIntechApp.model.Budget;
import com.sampleSpringBootProject.FIntechApp.repository.BudgetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BudgetService {
    @Autowired
    private BudgetRepository budgetRepository;

    public List<Budget> getBudgetsByUserId(Long userId) {
        return budgetRepository.findByUserId(userId);
    }
}
