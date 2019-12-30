package com.hospital.demo.service.organization;

import java.util.List;

import com.hospital.demo.entity.organization.Department;

public interface DepartmentService {

	void addDepartment();

	Department getDepartmentById();

	List<Department> getAllDepartments();

	void addStaffToDepartment();

	void addWardToDepartment();

	void createTeam();

}
