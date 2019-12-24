package com.hospital.demo.entity.organization;

import java.time.LocalDate;

import com.hospital.demo.util.Gender;

import lombok.Data;

@Data
public abstract class Person {

	private String title;
	private String givenName;
	private String middleName;
	private String familyName;
	private LocalDate birthDate;
	private Gender gender;
	private String phone;
	private String uniqueId;

}
