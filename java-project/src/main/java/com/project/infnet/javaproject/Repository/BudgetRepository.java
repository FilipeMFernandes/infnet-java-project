package com.project.infnet.javaproject.Repository;

import com.project.infnet.javaproject.domain.Budget;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BudgetRepository extends CrudRepository<Budget,Long> {
}
