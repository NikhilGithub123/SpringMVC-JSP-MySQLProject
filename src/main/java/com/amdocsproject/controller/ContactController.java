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

import com.amdocsproject.model.contact;
import com.amdocsproject.model.contactform;
import com.amdocsproject.model.course;
import com.amdocsproject.model.courseform;
import com.amdocsproject.model.user;
import com.amdocsproject.service.UserService;

@Controller
public class ContactController {

	@Autowired
	UserService userService;
	
	  @RequestMapping(value = "/Contact", method = RequestMethod.GET)
	  public ModelAndView Contact(HttpServletRequest request, HttpServletResponse response) {
	    ModelAndView mav = new ModelAndView("Contact");
	    mav.addObject("contact", new contact());
	    return mav;
	  }
	  
	  @RequestMapping(value = "/contactProcess", method = RequestMethod.POST)
	  public ModelAndView viewContact(HttpServletRequest request, HttpServletResponse response,
	  @ModelAttribute("contact") contact contact) {

	  userService.registercontact(contact);

	  return new ModelAndView("Thanks_Contact", "name", contact.getName());
	  }
	  
	  @RequestMapping(value = "/ViewContacts", method = RequestMethod.GET)
	  public ModelAndView showCourses(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("contact") contact contact) {
	    ModelAndView mav = new ModelAndView("ViewContacts");
	    
	    List<contact> contacts=userService.viewContacts();
	    
	    contactform contactform= new contactform();
	    
	    contactform.setContacts(contacts);
		    mav.addObject("contactform",contactform);
	    return mav;
	  }
	  
}
