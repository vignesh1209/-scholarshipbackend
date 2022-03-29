package com.lti.app.scholarshipbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.app.scholarshipbackend.beans.Ministry;
import com.lti.app.scholarshipbackend.beans.MinistryRegistration;
import com.lti.app.scholarshipbackend.service.MinistryRegistrationService;


@CrossOrigin(origins="*") 
@RestController
@RequestMapping("/minService")
public class MinistryRegistrationController{




	
	@Autowired
	MinistryRegistrationService minService;
	
	@PostMapping("/MinistryRegistration")
	public int addMinistryRegistration(@RequestBody MinistryRegistration e) {
	return minService.addMinistryRegistration(e); }

	
	

	
}
