package com.spmongo.mongodemo.controller;

import com.spmongo.mongodemo.model.Employee;
import com.spmongo.mongodemo.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepo employeeRepo;

    @PostMapping("/saveEmployee")
    public String saveEmp(@RequestBody Employee employee){
        employeeRepo.save(employee);
        return "Employee saved";
    }
}
