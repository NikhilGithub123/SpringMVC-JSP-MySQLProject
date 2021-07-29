package com.amdocsproject.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.amdocsproject.model.admin;
import com.amdocsproject.model.adminlogin;
import com.amdocsproject.model.login;
import com.amdocsproject.model.user;
import com.amdocsproject.service.UserService;

@Controller
public class AdminController {
	@Autowired
	UserService userService;
	
	@RequestMapping(value="/admin", method=RequestMethod.GET)
	public ModelAndView showAdmin(HttpServletRequest request, HttpServletResponse response) {
	    ModelAndView mav = new ModelAndView("admin");
	    mav.addObject("admin", new admin());
	    return mav;
	}
	  @RequestMapping(value = "/loginProcessAdmin", method = RequestMethod.POST)
	  public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,
	  @ModelAttribute("adminlogin") adminlogin adminlogin) {
		  
		  ModelAndView mav=null;
		  admin admin=userService.validateAdmin(adminlogin);
		  if(admin != null)
		  {
			  mav=new ModelAndView("AdminView");
//			  mav.addObject("name",admin.getName());
		  }
		  else {
			  mav=new ModelAndView("admin");
			  mav.addObject("message","Sorry, wrong username or password!");
		  }
		  return mav;
		  
	  }
}
