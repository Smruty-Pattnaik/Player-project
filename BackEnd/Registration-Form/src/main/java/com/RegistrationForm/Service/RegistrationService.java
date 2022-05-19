package com.RegistrationForm.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.RegistrationForm.Entity.User;
import com.RegistrationForm.Repository.RegistrationRepo;

@Service
public class RegistrationService {
	
	@Autowired
	private RegistrationRepo repository;
	
	public User saveDetails(User form) {
		
		return repository.save(form);
	}
	
	public ResponseEntity<?> checkValidUser(User userData){
		
		User user= repository.findByUserName(userData.getUserName());
		if(user.getUserPassword().equals(userData.getUserPassword())) {
			return ResponseEntity.ok(user);
		}
		
		return (ResponseEntity<?>) ResponseEntity.internalServerError();
	}

}
