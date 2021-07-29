package com.amdocsproject.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.amdocsproject.model.user;



@Controller
@Scope("session")
public class UserController {
	@RequestMapping(value="/user", method=RequestMethod.GET)
	public ModelAndView user(HttpServletRequest request, HttpServletResponse response) {
	    ModelAndView mav = new ModelAndView("user");
	    return mav;
	}
}
