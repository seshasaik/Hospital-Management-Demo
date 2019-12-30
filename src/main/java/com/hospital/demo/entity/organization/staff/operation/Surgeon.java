package com.hospital.demo.entity.organization.staff.operation;

import java.time.LocalDate;
import java.util.List;

import com.hospital.demo.entity.organization.Department;
import com.hospital.demo.util.Gender;

public class Surgeon extends Doctor {

	public Surgeon(String title, String givenName, String middleName, String familyName, LocalDate birthDate,
			Gender gender, String phone, String uniqueId, LocalDate joined, List<String> education,
			List<String> languages, Department department, String[] specality, String[] locations) {
		super(title, givenName, middleName, familyName, birthDate, gender, phone, uniqueId, joined, education,
				languages, department, specality, locations);
		// TODO Auto-generated constructor stub
	}

}
