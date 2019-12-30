package com.hospital.demo.entity.organization.department.treatment;

import com.hospital.demo.entity.organization.department.treatment.event.Therapy;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Prescription {

	private String name;
	private String qty;
	private String[] regularUsageFrequncy;
	private String[] timing;
	private Therapy therapy;

}
