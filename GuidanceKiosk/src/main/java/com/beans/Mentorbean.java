package com.beans;

import java.util.Arrays;

import com.mysql.cj.jdbc.Blob;

public class Mentorbean {
	private String firstname;
	private String lastname;
	private String email;
	private String password;
	private String jobtitle;
	private String companyname;
	private String location;
	private String category;
	private String skills;
	private String text;
	private String linkedinurl;
	private String personalwebsite;
	private Blob image;
	
	public Mentorbean(String firstname, String lastname, String email, String password, String jobtitle,
			String companyname, String location, String category, String skills, String text, String linkedinurl,
			String personalwebsite) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
		this.jobtitle = jobtitle;
		this.companyname = companyname;
		this.location = location;
		this.category = category;
		this.skills = skills;
		this.text = text;
		this.linkedinurl = linkedinurl;
		this.personalwebsite = personalwebsite;
		
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getJobtitle() {
		return jobtitle;
	}

	public void setJobtitle(String jobtitle) {
		this.jobtitle = jobtitle;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getLinkedinurl() {
		return linkedinurl;
	}

	public void setLinkedinurl(String linkedinurl) {
		this.linkedinurl = linkedinurl;
	}

	public String getPersonalwebsite() {
		return personalwebsite;
	}

	public void setPersonalwebsite(String personalwebsite) {
		this.personalwebsite = personalwebsite;
	}

	public Blob getImage() {
		return image;
	}

	public void setImage(Blob image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "Mentorbean [firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + ", password="
				+ password + ", jobtitle=" + jobtitle + ", companyname=" + companyname + ", location=" + location
				+ ", category=" + category + ", skills=" + skills + ", text=" + text + ", linkedinurl=" + linkedinurl
				+ ", personalwebsite=" + personalwebsite + ", image=" + image + "]";
	}


	
	
	
	
	
	
	
	
	
}
