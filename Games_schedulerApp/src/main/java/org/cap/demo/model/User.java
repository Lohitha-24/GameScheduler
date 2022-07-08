package org.cap.demo.model;

import java.time.LocalDate;

public class User {
	private String firstName;
	private String lastName;
	private String address;
	private String mobile;
	private UserType userType;
	private LocalDate registrationDate;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public UserType getUserType() {
		return userType;
	}
	public void setUserType(UserType userType) {
		this.userType = userType;
	}
	public LocalDate getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(LocalDate registrationDate) {
		this.registrationDate = registrationDate;
	}
	public User(String firstName, String lastName, String address, String mobile, UserType userType,
			LocalDate registrationDate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.mobile = mobile;
		this.userType = userType;
		this.registrationDate = registrationDate;
	}
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", mobile=" + mobile
				+ ", userType=" + userType + ", registrationDate=" + registrationDate + "]";
	}
	
	
}
