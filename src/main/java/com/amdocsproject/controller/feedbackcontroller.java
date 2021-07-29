package com.amdocsproject.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.amdocsproject.model.course;
import com.amdocsproject.model.courseform;
import com.amdocsproject.model.feedback;
import com.amdocsproject.model.feedbackform;
import com.amdocsproject.model.user;
import com.amdocsproject.service.UserService;

@Controller
public class feedbackcontroller {
	
	@Autowired
	UserService userService;
	
	  @RequestMapping(value = "/feedback", method = RequestMethod.GET)
	  public ModelAndView Feedback(HttpServletRequest request, HttpServletResponse response) {
	    ModelAndView mav = new ModelAndView("feedback");
	    mav.addObject("feedback", new feedback());
	    return mav;
	  }
	  
	  @RequestMapping(value = "/feedbackProcess", method = RequestMethod.POST)
	  public ModelAndView addCourse(HttpServletRequest request, HttpServletResponse response,
	  @ModelAttribute("feedback") feedback fd) {

	  userService.registerfd(fd);

	  return new ModelAndView("thanks_fd", "name", fd.getName());
	  }

	  @RequestMapping(value = "/ViewFeedbacks", method = RequestMethod.GET)
	  public ModelAndView showCourses(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("feedback") feedback fd) {
	    ModelAndView mav = new ModelAndView("ViewFeedbacks");
	    
	    List<feedback> fds=userService.viewFeedbacks();
	    
	    feedbackform feedbackform= new feedbackform();
	    
	    feedbackform.setFeedbacks(fds);
		    mav.addObject("feedbackform",feedbackform);
	    return mav;
	  }
}
