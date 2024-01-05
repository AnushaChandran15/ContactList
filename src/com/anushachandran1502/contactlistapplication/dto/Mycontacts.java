package com.anushachandran1502.contactlistapplication.dto;

public class Mycontacts {
	private String name;
	private String phoneNumber;

	public Mycontacts(String name2, String phNo) {
		this.name=name2;
		this.phoneNumber=phNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	@Override
	public String toString() {
		return String.format("| %-10s | %-2s |", name, phoneNumber);
	}

}
