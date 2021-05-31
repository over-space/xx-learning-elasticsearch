package com.learning.elasticsearch.service.impl;

import com.learning.elasticsearch.domain.EmployeeES;
import com.learning.elasticsearch.repository.EmployeeRepository;
import com.learning.elasticsearch.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void createIndex(EmployeeES employee) {
        employeeRepository.save(employee);
    }

    @Override
    public EmployeeES getById(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }
}
