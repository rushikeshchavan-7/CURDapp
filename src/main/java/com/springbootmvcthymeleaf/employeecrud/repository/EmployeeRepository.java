package com.springbootmvcthymeleaf.employeecrud.repository;

import com.springbootmvcthymeleaf.employeecrud.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    List<Employee> findByLastNameContainingIgnoreCase(String lastName);
}
