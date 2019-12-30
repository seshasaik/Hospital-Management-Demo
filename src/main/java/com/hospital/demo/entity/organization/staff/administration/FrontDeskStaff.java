package com.hospital.demo.entity.organization.staff.administration;

import java.time.LocalDate;
import java.util.List;

import com.hospital.demo.entity.organization.Department;
import com.hospital.demo.util.Gender;

public class FrontDeskStaff extends AdministrativeStaff {

	public FrontDeskStaff(String title, String givenName, String middleName, String familyName, LocalDate birthDate,
			Gender gender, String phone, String uniqueId, LocalDate joined, List<String> education,
			List<String> languages, Department department, AdministariveStaffType staffType) {
		super(title, givenName, middleName, familyName, birthDate, gender, phone, uniqueId, joined, education,
				languages, department, staffType);
		// TODO Auto-generated constructor stub
	}

}
