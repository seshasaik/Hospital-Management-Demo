package com.hospital.demo.entity.organization.staff.technical;

import java.time.LocalDate;
import java.util.List;

import com.hospital.demo.entity.organization.Department;
import com.hospital.demo.util.Gender;

import lombok.Data;

@Data
public class Technologist extends TechnicalStaff {

	public Technologist(String title, String givenName, String middleName, String familyName, LocalDate birthDate,
			Gender gender, String phone, String uniqueId, LocalDate joined, List<String> education,
			List<String> languages, Department department) {
		super(title, givenName, middleName, familyName, birthDate, gender, phone, uniqueId, joined, education,
				languages, department);
		// TODO Auto-generated constructor stub
	}

}
