package com.spmongo.mongodemo.repository;

import com.spmongo.mongodemo.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepo extends MongoRepository <Employee,String> {
}
