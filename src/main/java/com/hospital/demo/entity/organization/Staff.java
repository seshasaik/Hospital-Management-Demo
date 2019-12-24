package com.hospital.demo.entity.organization;

import java.time.LocalDate;
import java.util.List;

import lombok.Data;

@Data
public class Staff extends Person {
	private LocalDate joined;
	private List<String> education;
	private List<String> certification;
	private List<String> languages;
}
