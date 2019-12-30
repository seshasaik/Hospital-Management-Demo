package com.hospital.demo.repository.organization;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.hospital.demo.entity.organization.Department;

@Repository
public interface DepartmentRepository extends MongoRepository<Department, String> {

}
