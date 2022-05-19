package com.RegistrationForm.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.RegistrationForm.Entity.User;
import com.RegistrationForm.Service.RegistrationService;

@RestController
@CrossOrigin(origins= "*")
@RequestMapping("/rest")
public class Controller {
	
	@Autowired
	private RegistrationService service;
	
	@PostMapping("/add")
	public User saveDetails(@RequestBody User form) {
		
		return service.saveDetails(form);
		
	}
	
	@PostMapping("/checkValidity")
	public ResponseEntity<?> checkValidUser(@RequestBody User userData)
	{
		return service.checkValidUser(userData);
	}
	

}
