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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.amdocsproject.model.user;
import com.amdocsproject.service.UserService;

@Controller
public class EnrolledController {

	@Autowired
	UserService userservice;
	
	  @RequestMapping(value = "enrolled", method = RequestMethod.GET)
	  public ModelAndView enrolled(HttpSession session,HttpServletRequest request, HttpServletResponse response, @RequestParam(value="course.cid") String course_id) {
		  user user=(user)request.getSession().getAttribute("user");
		  userservice.enrolled(user,course_id);
		    ModelAndView mav = new ModelAndView("enroll");
		    mav.addObject("name", user.getName());
		    mav.addObject("cid",course_id);
		  return mav;
		  
	  }
}
