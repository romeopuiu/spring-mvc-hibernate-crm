package com.romeo.spring.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.romeo.spring.mvc.model.Doctor;
import com.romeo.spring.mvc.service.DoctorService;

@Controller
@RequestMapping("/doctor")
public class DoctorController {
	
	
	
	@Autowired
	private DoctorService doctorService;
	
	
	@RequestMapping("/list")
	public String listDoctori(Model theModel) {
		
         List<Doctor> theDoctori = doctorService.getDoctori();
         
         theModel.addAttribute("doctori", theDoctori);
         
		return "list-doctori";
	}
	

	@RequestMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		Doctor theDoctor =  new Doctor();
		theModel.addAttribute("doctor", theDoctor);
		
		
		return "doctor-form";
		
	}
	
	@RequestMapping("saveDoctor")
	public String saveDoctor(@ModelAttribute("doctor") Doctor theDoctor) {
		
		doctorService.saveDoctor(theDoctor);
		
		
		
		return "redirect:/doctor/list";
	}
	
	
	@RequestMapping("showFormForUpdate")
	public String showFormForUpdate(@RequestParam("doctorId") int theId, Model theModel) {
		
		Doctor theDoctor = doctorService.getDoctor(theId);
		
		theModel.addAttribute("doctor", theDoctor);
		
		return "doctor-form";
	}
	
	
	@RequestMapping("/delete")
	public String deleteDoctor(@RequestParam("doctorId") int theId) {
		
		doctorService.deleteDoctor(theId);
		
		
		return "redirect:/doctor/list";
	}
}
