package com.project.infnet.javaproject.Controller;

import com.project.infnet.javaproject.Repository.BudgetRepository;
import com.project.infnet.javaproject.domain.Budget;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("budget")
public class BudgetController {

    @Autowired
    BudgetRepository budgetRepository;

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Budget> findAll (){
        return budgetRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Budget save (@RequestBody Budget budget){
        Budget savedBudget = budgetRepository.save(budget);
        return savedBudget;
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void remove(@RequestBody Budget budget){
        budgetRepository.deleteById(budget.getId());
    }

}