package com.learning.elasticsearch.service;

import com.learning.elasticsearch.domain.EmployeeES;

public interface EmployeeService {

    void createIndex(EmployeeES employee);

    EmployeeES getById(Long id);
}
