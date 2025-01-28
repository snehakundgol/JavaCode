package com.xworkz.digilocker.dto;

import java.util.Objects;

public class DigilockerDto {
	
	private String name;
    private String dateOfBirth;
    private String aadhaarNumber;
    private String mobileNumber;
    private String email;
    private String username;
    private String password;
    private String gender;
    private String address;
    private String pinCode;
    
   

	public DigilockerDto(String name, String dateOfBirth, String aadhaarNumber, String mobileNumber, String email,
			String username, String password, String gender, String address, String pinCode) {
		super();
		
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.aadhaarNumber = aadhaarNumber;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.username = username;
		this.password = password;
		this.gender = gender;
		this.address = address;
		this.pinCode = pinCode;
	}
	public DigilockerDto() {
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getAadhaarNumber() {
		return aadhaarNumber;
	}
	public void setAadhaarNumber(String aadhaarNumber) {
		this.aadhaarNumber = aadhaarNumber;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	@Override
	public int hashCode() {
		return Objects.hash(aadhaarNumber, address, dateOfBirth, email, gender, mobileNumber, name, password, pinCode,
				username);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DigilockerDto other = (DigilockerDto) obj;
		return Objects.equals(aadhaarNumber, other.aadhaarNumber) && Objects.equals(address, other.address)
				&& Objects.equals(dateOfBirth, other.dateOfBirth) && Objects.equals(email, other.email)
				&& Objects.equals(gender, other.gender) && Objects.equals(mobileNumber, other.mobileNumber)
				&& Objects.equals(name, other.name) && Objects.equals(password, other.password)
				&& Objects.equals(pinCode, other.pinCode) && Objects.equals(username, other.username);
	}
	@Override
	public String toString() {
		return "DigilockerDto [name=" + name + ", dateOfBirth=" + dateOfBirth + ", aadhaarNumber=" + aadhaarNumber
				+ ", mobileNumber=" + mobileNumber + ", email=" + email + ", username=" + username + ", password="
				+ password + ", gender=" + gender + ", address=" + address + ", pinCode=" + pinCode + "]";
	}
 }
