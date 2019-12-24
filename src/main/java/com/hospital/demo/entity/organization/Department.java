package com.hospital.demo.entity.organization;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class Department {

	private String id;
	private String name;
	private String deptCode;
}
