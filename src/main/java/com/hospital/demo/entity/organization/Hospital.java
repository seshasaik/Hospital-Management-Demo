package com.hospital.demo.entity.organization;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class Hospital {

	private String id;
	private String name;
	private String address;
	private String phone;
	private List<Department> departments;
}
