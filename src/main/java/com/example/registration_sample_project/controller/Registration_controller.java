package com.example.registration_sample_project.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.registration_sample_project.model.UserData;
import com.example.registration_sample_project.service.serviceimpl.register_services;

@Controller
public class Registration_controller {

	@Autowired
	register_services rsc;
	
	@RequestMapping(value="/insertData",method = RequestMethod.POST)
	public ModelAndView InsertData(@ModelAttribute UserData ud) {
		ArrayList<UserData> datalist= rsc.registerData(ud);
		ModelAndView model = new ModelAndView();
		model.addObject("datalist",datalist);
		model.setViewName("resample");
		return model;
		
	}
	
	@RequestMapping(value="/delete/{id}",method=RequestMethod.GET)
	public ModelAndView DeleteData(@PathVariable(name="id")String id) {
		ArrayList<UserData> datalist = rsc.deleteData(id);
		ModelAndView model = new ModelAndView();
		model.addObject("datalist",datalist);
		model.setViewName("resample");
		return model;
	}
	
	@RequestMapping(value="/update/{id}", method=RequestMethod.GET)
	public ModelAndView UpdateData(@PathVariable(name="id")String id) {
		UserData ud = rsc.update(id);
		ModelAndView model = new ModelAndView ();
		model.addObject("ud",ud);
		model.setViewName("updateform");
		return model;
	}
	
	@RequestMapping(value="/updateData",method = RequestMethod.POST)
	public ModelAndView updateData(@ModelAttribute UserData ud) {
		ArrayList <UserData> datalist = rsc.changingdata(ud);
		ModelAndView model = new ModelAndView();
		model.addObject("datalist",datalist);
		model.setViewName("resample");
		return model;
	}
}
