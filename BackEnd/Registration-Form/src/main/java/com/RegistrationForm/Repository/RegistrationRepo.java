package com.RegistrationForm.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.RegistrationForm.Entity.User;

public interface RegistrationRepo extends JpaRepository<User, Integer> {

	User save(RegistrationRepo repository);
	User findByUserName(String userName);

}
