package com.learning.elasticsearch;

import com.learning.elasticsearch.domain.EmployeeES;
import com.learning.elasticsearch.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class XxLearningElasticsearchApplicationTests {

    @Autowired
    private EmployeeService employeeService;

    @Test
    void contextLoads() {
    }

    @Test
    void createIndex(){
        EmployeeES employee = new EmployeeES();
        employee.setId(1L);
        employee.setName("lisi");
        employee.setAge(20);
        employeeService.createIndex(employee);
    }


    @Test
    void testGetById(){
        EmployeeES employee = employeeService.getById(1L);

        System.out.println(employee);
    }
}
