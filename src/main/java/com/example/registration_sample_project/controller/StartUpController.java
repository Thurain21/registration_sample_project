package com.example.registration_sample_project.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.example.registration_sample_project.model.UserData;

@Controller
public class StartUpController {

	
	@RequestMapping(value="/registration",method=RequestMethod.GET)
	public ModelAndView register() {
		UserData ud = new UserData(null,null,null,null,null,null);
		ModelAndView model = new ModelAndView();
		model.addObject("ud",ud);
		model.setViewName("resample");
		return model;
	}
}
