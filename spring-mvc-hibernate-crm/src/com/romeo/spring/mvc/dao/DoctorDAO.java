package com.romeo.spring.mvc.dao;

import java.util.List;

import com.romeo.spring.mvc.model.Doctor;

public interface DoctorDAO {
	
	public List<Doctor> getDoctori();
	
	public void saveDoctor(Doctor theDoctor);
	
	public Doctor getDoctor(int theId);
	
	public void deleteDoctor(int theId);
	

}
