package com.romeo.spring.mvc.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.romeo.spring.mvc.dao.DoctorDAO;
import com.romeo.spring.mvc.model.Doctor;


@Service
public class DoctorServiceImpl implements  DoctorService{

	
	@Autowired
	private DoctorDAO doctorDAO;
	
	
	
	@Override
	@Transactional
	public List<Doctor> getDoctori() {
		return doctorDAO.getDoctori();
	}

	@Override
	@Transactional
	public void saveDoctor(Doctor theDoctor) {

		doctorDAO.saveDoctor(theDoctor);
		
		
	}

	@Override
	@Transactional
	public Doctor getDoctor(int theId) {
		return doctorDAO.getDoctor(theId);
	}

	@Override
	@Transactional
	public void deleteDoctor(int theId) {

		doctorDAO.deleteDoctor(theId);
		
		
		
	}
	
	
	

}
