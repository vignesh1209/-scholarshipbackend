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
import com.lti.app.scholarshipbackend.service.MinistryService;




@CrossOrigin(origins="*") 
@RestController
@RequestMapping("/minService")
public class MinistryController {
	
	@Autowired
	MinistryService minService;
	
	

	@PostMapping("/ministry")
	public int addMinistry(@RequestBody Ministry e) {
	return minService.addMinistry(e); }
	
}
