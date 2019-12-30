package com.hospital.demo.entity.organization.staff;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.DBRef;

import com.hospital.demo.entity.organization.Department;
import com.hospital.demo.entity.organization.Person;
import com.hospital.demo.util.Gender;

import lombok.Data;

@Data
public abstract class Staff extends Person {
	private LocalDate joined;
	private List<String> education;
	private List<String> certification;
	private List<String> languages;

	@DBRef
	private Department department;

	public Staff(String title, String givenName, String middleName, String familyName, LocalDate birthDate,
			Gender gender, String phone, String uniqueId, LocalDate joined, List<String> education,
			List<String> languages, Department department) {
		super(title, givenName, middleName, familyName, birthDate, gender, phone, uniqueId);
		this.joined = joined;
		this.education = education;
		this.languages = languages;
		this.department = department;
	}

}
