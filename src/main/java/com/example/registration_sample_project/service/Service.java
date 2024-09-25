package com.example.registration_sample_project.service;

import java.util.ArrayList;

import com.example.registration_sample_project.model.UserData;

public interface Service {

	public ArrayList<UserData> registerData(UserData ud);
	public ArrayList<UserData> deleteData(String id);
	public UserData update(String id);
	public ArrayList<UserData> changingdata(UserData ud);
	
}
