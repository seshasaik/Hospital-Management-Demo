package com.hospital.demo.entity.organization;

import java.time.LocalDate;

import com.hospital.demo.util.Gender;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public abstract class Person {

	private String title;
	private String givenName;
	private String middleName;
	private String familyName;
	private LocalDate birthDate;
	private Gender gender;

	@EqualsAndHashCode.Include
	private String phone;

	@EqualsAndHashCode.Include
	private String uniqueId;

}
