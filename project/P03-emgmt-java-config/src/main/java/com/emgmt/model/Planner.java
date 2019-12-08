package com.emgmt.model;

public class Planner {
	private String plannerId;
	private String name;
	private String designation;
	private Double salary;
	private String password;
	private String address;
	private String contactNo;
	private String emailId;
	public String getPlannerId() {
		return plannerId;
	}
	public void setPlannerId(String plannerId) {
		this.plannerId = plannerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	@Override
	public String toString() {
		return "Planner [plannerId=" + plannerId + ", name=" + name + ", designation=" + designation + ", salary="
				+ salary + ", address=" + address + ", contactNo=" + contactNo + ", emailId="
				+ emailId + "]";
	}



}
