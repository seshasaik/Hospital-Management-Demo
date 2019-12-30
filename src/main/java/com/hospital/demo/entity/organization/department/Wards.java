package com.hospital.demo.entity.organization.department;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.hospital.demo.entity.organization.Department;
import com.hospital.demo.entity.organization.Hospital;
import com.hospital.demo.entity.organization.Patient;
import com.hospital.demo.util.Gender;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Document
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Wards {

	@EqualsAndHashCode.Include
	private String wardId;

	@EqualsAndHashCode.Include
	private Gender patientGeder;
	private Integer capacity;

	private Hospital hospital;

	private Department department;

	@DBRef
	private List<Patient> patients;

}
