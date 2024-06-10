package com.beans;

public class Userbean {
	private String firstname;
	private String lastname;
	private int age;
	private String email;
	private String password;
	public Userbean(){
		
	}
	public Userbean(String firstname, String lastname, int age, String email, String password) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.email = email;
		this.password = password;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
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
	@Override
	public String toString() {
		return "Userbean [firstname=" + firstname + ", lastname=" + lastname + ", age=" + age + ", email=" + email
				+ ", password=" + password + "]";
	}
	
	
	
	

}
