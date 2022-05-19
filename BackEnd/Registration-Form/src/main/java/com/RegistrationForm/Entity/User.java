package com.RegistrationForm.Entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class User {
	
	@Id
	@GeneratedValue
	private int userId;
	private String userName;
	private int userAge;
	private String userGender;
	private String userHobbies;
	private String userPassword;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int userId, String userName, int userAge, String userGender, String userHobbies, String userPassword) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userAge = userAge;
		this.userGender = userGender;
		this.userHobbies = userHobbies;
		this.userPassword = userPassword;
	}
	public int getUserId() {
		return userId;
	}
	public String getUserName() {
		return userName;
	}
	public int getUserAge() {
		return userAge;
	}
	public String getUserGender() {
		return userGender;
	}
	public String getUserHobbies() {
		return userHobbies;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}
	public void setUserHobbies(String userHobbies) {
		this.userHobbies = userHobbies;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
	
	
	
	

}
