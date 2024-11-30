package com.sampleSpringBootProject.FIntechApp.controller;

import com.sampleSpringBootProject.FIntechApp.model.Budget;
import com.sampleSpringBootProject.FIntechApp.service.BudgetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BudgetController {
    @Autowired
    private BudgetService budgetService;

    @GetMapping("/{userId}")
    public List<Budget> getBudgets(@PathVariable Long userId) {
        return budgetService.getBudgetsByUserId(userId);
    }
}
