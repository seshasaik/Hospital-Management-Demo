package com.hospital.demo.entity.organization.staff.operation;

import java.time.LocalDate;
import java.util.List;

import com.hospital.demo.entity.organization.Department;
import com.hospital.demo.entity.organization.staff.technical.SurgicalTechnologist;
import com.hospital.demo.util.Gender;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Doctor extends OperationStaff {

	private String specality[];
	private String locations[];

	public Doctor(String title, String givenName, String middleName, String familyName, LocalDate birthDate,
			Gender gender, String phone, String uniqueId, LocalDate joined, List<String> education,
			List<String> languages, Department department, String[] specality, String[] locations) {
		super(title, givenName, middleName, familyName, birthDate, gender, phone, uniqueId, joined, education,
				languages, department);
		this.specality = specality;
		this.locations = locations;
	}

}
