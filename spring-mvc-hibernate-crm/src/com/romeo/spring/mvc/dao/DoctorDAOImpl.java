package com.romeo.spring.mvc.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.romeo.spring.mvc.model.Doctor;


@Repository
public class DoctorDAOImpl implements  DoctorDAO{

	
	@Autowired
	SessionFactory sessionFactory;
	
	
	@Override
	public List<Doctor> getDoctori() {
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		Query<Doctor> theQuery = currentSession.createQuery("from Doctor order by first_name",
				Doctor.class);
		
		List<Doctor> doctori = theQuery.getResultList();
		
		
		return doctori;
	}

	@Override
	public void saveDoctor(Doctor theDoctor) {
       Session currentSession = sessionFactory.getCurrentSession();
       
       currentSession.saveOrUpdate(theDoctor);
       
		
		
	}

	@Override
	public Doctor getDoctor(int theId) {
	
		Session currentSession = sessionFactory.getCurrentSession();
		
		Doctor theDoctor = currentSession.get(Doctor.class, theId);
		
		
		return theDoctor;
	}

	@Override
	public void deleteDoctor(int theId) {

		Session currentSession = sessionFactory.getCurrentSession();
		
   		Query  theQuery = currentSession.createQuery("delete from Doctor where id=:doctorId");
   		theQuery.setParameter("doctorId", theId);
   		
   		theQuery.executeUpdate();
		
	}
	
	
	

}
