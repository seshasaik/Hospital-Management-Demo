package com.hospital.demo.entity.organization.department.treatment.event;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class PatientTreatment {

	private String treatmentType;

	private String Description;

}
