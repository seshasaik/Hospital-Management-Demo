package com.hospital.demo.entity.organization.department.team;

import java.util.List;

import com.hospital.demo.entity.organization.Department;
import com.hospital.demo.entity.organization.staff.operation.Doctor;

import lombok.Data;

@Data
public class Team {

	private String name;

	private List<Doctor> juniorDoctors;

	private Department department;

	private Doctor consultantDoctor;

}
