package com.example.registration_sample_project.model;

public class UserData {
	private String id;
	private String name;
	private String age;
	private String gender;
	private String email;
	private String country;
	
	public UserData(String id,String  name,String age, String gender,String email, String country) {
		this.id=id;
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.email=email;
		this.country=country;
	}
	public String getName() {
		return name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
}
