package com.springbootmvcthymeleaf.employeecrud.service;

import com.springbootmvcthymeleaf.employeecrud.model.Employee;
import com.springbootmvcthymeleaf.employeecrud.repository.EmployeeRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    EmployeeRepository employeeRepository;
    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }
    @Override
    public List<Employee> findAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findEmpById(int id) {
        Optional<Employee> employee= employeeRepository.findById(id);
        return employee.orElse(null);
    }

    @Override
    public List<Employee> findEmpByLastName(String lastName) {
        return employeeRepository.findByLastNameContainingIgnoreCase(lastName);
    }

    @Transactional
    @Override
    public void createEmployee(Employee employee) {
        employeeRepository.saveAndFlush(employee);
    }


    @Transactional
    @Override
    public void deleteEmployee(int id) {
        employeeRepository.deleteById(id);
    }
}
