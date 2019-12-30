package com.hospital.demo.service.organization.staff;

import com.hospital.demo.entity.organization.staff.administration.AdministrativeStaff;
import com.hospital.demo.entity.organization.staff.technical.TechnicalStaff;

public interface StaffService {

	public void addDoctor();
	
	public void addAdminstrativeStaff(AdministrativeStaff staff);
	
	public void addNurse();
	
	public void addTechnicalStaff(TechnicalStaff technicalStaff);
	
	
	
	
	public void getAllDoctors(String hospitalId);
	
	
	
	
}
