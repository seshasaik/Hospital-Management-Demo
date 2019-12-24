package com.hospital.demo.entity.organization;

import java.time.LocalDate;

import org.springframework.data.annotation.Transient;

import lombok.Data;

@Data
public class Patient extends Person {
	
	private String id;
	
	@Transient
	private String age;
	private LocalDate accepted;
	
}
