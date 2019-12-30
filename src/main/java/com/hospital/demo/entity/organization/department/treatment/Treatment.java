package com.hospital.demo.entity.organization.department.treatment;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;

import com.hospital.demo.entity.organization.Patient;
import com.hospital.demo.entity.organization.department.treatment.event.Examination;
import com.hospital.demo.entity.organization.department.treatment.event.PatientTreatment;
import com.hospital.demo.entity.organization.staff.operation.Doctor;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Treatment {

	@Id
	private String id;

	@NonNull
	private Doctor doctor;

	@NonNull
	private Patient patient;

	private LocalDate date = LocalDate.now();

	private List<Diagnosis> diagnosis;

	private ArrayList<Examination> examination;

	private List<Prescription> prescription;

	private List<PatientTreatment> patientTreatment;

}
