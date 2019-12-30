package com.hospital.demo.service.organization;

import java.util.List;

import com.hospital.demo.entity.organization.Department;
import com.hospital.demo.entity.organization.Hospital;
import com.hospital.demo.entity.organization.Patient;

public interface HospitalService {

	void addHospital(Hospital hospital);

	void updateHospital(String hospitalId, Hospital hospital);

	void addDepartmentsToHospital(String hospitalId, List<Department> departments);

	void removeDepartmentFromHospital(String hositalId, List<String> departmentId);

	void registerPatient(Patient patient);

}
