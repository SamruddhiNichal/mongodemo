package com.spmongo.mongodemo.repository;

import com.spmongo.mongodemo.model.Department;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DepartmentRepo extends MongoRepository<Department,String> {
}
