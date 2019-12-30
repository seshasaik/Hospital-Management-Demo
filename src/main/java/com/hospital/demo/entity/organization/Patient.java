package com.hospital.demo.entity.organization;

import java.time.LocalDate;

import org.springframework.data.annotation.Transient;

import com.hospital.demo.util.Gender;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
public class Patient extends Person {

	private String id;

	@Transient
	private String age;
	private LocalDate accepted;

	public Patient(String title, String givenName, String middleName, String familyName, LocalDate birthDate,
			Gender gender, String phone, String uniqueId, LocalDate accepted) {
		super(title, givenName, middleName, familyName, birthDate, gender, phone, uniqueId);

		this.accepted = accepted;
	}

}
