package com.example.registration_sample_project.service.serviceimpl;

import java.util.ArrayList;

import com.example.registration_sample_project.model.UserData;
import com.example.registration_sample_project.service.Service;



@org.springframework.stereotype.Service
public class register_services implements Service {
	private ArrayList<UserData> datalist = new ArrayList<UserData>();

	@Override
	public ArrayList<UserData> register(UserData ud) {
		ud.setId(String.valueOf(datalist.size()));
		datalist.add(ud);
		return datalist;
	}

	@Override
	public ArrayList<UserData> deleteData(String id) {
		datalist.remove(Integer.parseInt(id));
		return datalist;
	}

	@Override
	public UserData update(String id) {
		UserData ud = datalist.get(Integer.parseInt(id));
		return ud;
	}

	@Override
	public ArrayList<UserData> changingdata(UserData ud) {
	datalist.set(Integer.parseInt(ud.getId()), ud);
		return datalist;
	}
	
	
}
