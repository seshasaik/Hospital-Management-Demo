package com.hospital.demo.entity.organization.staff.administration;

import java.time.LocalDate;
import java.util.List;

import com.hospital.demo.entity.organization.Department;
import com.hospital.demo.entity.organization.staff.Staff;
import com.hospital.demo.util.Gender;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public abstract class AdministrativeStaff extends Staff {

	private AdministariveStaffType staffType;

	public AdministrativeStaff(String title, String givenName, String middleName, String familyName,
			LocalDate birthDate, Gender gender, String phone, String uniqueId, LocalDate joined, List<String> education,
			List<String> languages, Department department, AdministariveStaffType staffType) {
		super(title, givenName, middleName, familyName, birthDate, gender, phone, uniqueId, joined, education,
				languages, department);
		this.staffType = staffType;
	}

}
