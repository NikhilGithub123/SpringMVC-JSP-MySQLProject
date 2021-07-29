package com.amdocsproject.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.amdocsproject.model.course;
import com.amdocsproject.model.courseform;
import com.amdocsproject.model.user;
import com.amdocsproject.service.UserService;

@Controller
@Scope("session")
public class CoursesController {
	  @Autowired
	  public UserService userService;
	  private user user;
	  
	  @RequestMapping(value = "/Courses", method = RequestMethod.GET)
	  public ModelAndView RegisterCourse(HttpServletRequest request, HttpServletResponse response) {
	    ModelAndView mav = new ModelAndView("Courses");
	    mav.addObject("course", new course());
	    return mav;
	  }
	  
	  @RequestMapping(value = "/courseProcess", method = RequestMethod.POST)
	  public ModelAndView addCourse(HttpServletRequest request, HttpServletResponse response,
	  @ModelAttribute("course") course course) {

	  userService.registercourse(course);

	  return new ModelAndView("courseadded", "name", course.getCname());
	  }
	  
	  @RequestMapping(value = "/viewcourses", method = RequestMethod.GET)
	  public ModelAndView showCourses(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("user") user user) {
	    ModelAndView mav = new ModelAndView("ViewCourses");
	    
	    List<course> courses=userService.viewCourses();
	    
	    courseform courseform= new courseform();
	    
	    courseform.setCourses(courses);
		    mav.addObject("courseform",courseform);
	    return mav;
	  }

}
