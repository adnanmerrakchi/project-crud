package com.senso.management.dto;

import com.senso.management.model.Profile;

public class IndividuelAddDTO {

	private String firstName;
	private String lastName;
	private String phone;
	private String mail;
	private Profile profile;
	
	public IndividuelAddDTO() {
	}
	
	public IndividuelAddDTO(	String firstName,
							String lastName,
							String phone,
							String mail,
							Profile profile) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.mail = mail;
		this.profile = profile;
	}

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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}
}
