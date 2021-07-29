package com.amdocsproject.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.amdocsproject.model.login;
import com.amdocsproject.model.user;
import com.amdocsproject.service.UserService;

@Controller
@Scope("session")
public class LoginController {

	@Autowired
	UserService userService;
	private user user;
	
	  @RequestMapping(value = "/login", method = RequestMethod.GET)
	  public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response) {
	    ModelAndView mav = new ModelAndView("login");
	    mav.addObject("login", new login());
	    return mav;
	  }
	  
	  @RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
	  public ModelAndView loginProcess(HttpSession session, HttpServletRequest request, HttpServletResponse response,
	  @ModelAttribute("login") login login) {
		  
		  ModelAndView mav=null;
		  user user=userService.validateUser(login);
		  session.setAttribute("user", user);
		  if(user != null)
		  {
			  mav=new ModelAndView("UserView");
			  mav.addObject("name",user.getName());
		  }
		  else {
			  mav=new ModelAndView("login");
			  mav.addObject("message","Sorry, wrong username or password!");
		  }
		  return mav;
		  
	  }
}
