package com.amdocsproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.amdocsproject.doa.doa;
import com.amdocsproject.doa.doaIMPL;
import com.amdocsproject.model.admin;
import com.amdocsproject.model.adminlogin;
import com.amdocsproject.model.contact;
import com.amdocsproject.model.course;
import com.amdocsproject.model.feedback;
import com.amdocsproject.model.login;
import com.amdocsproject.model.user;

public class UserServiceIMPL implements UserService{
	
	@Autowired
	doaIMPL userDoa;
	
	  public void register(user user) {
		     userDoa.register(user);
		  }
	  
	  public user validateUser(login login) {
		    return userDoa.validateUser(login);
		  }
	  
	  public admin validateAdmin(adminlogin adminlogin) {
		  return userDoa.validateAdmin(adminlogin);
	  }
	  
	  public void registercourse(course course) {
		  userDoa.registercourse(course);
	  }
	  public List<course> viewCourses(){
		  return userDoa.viewCourses();
	  }
	  public List<feedback> viewFeedbacks(){
		  return userDoa.viewFeedbacks();
	  }
	  
	  public List<contact> viewContacts(){
		  return userDoa.viewContacts();
	  }
	  
	  
	  public void enrolled(user user,String course_id)
	  {
		  userDoa.enrolled(user,course_id);
	  }
	  public void registerfd(feedback fd) {
		  userDoa.registerfd(fd);
	  }
	  public void registercontact(contact c) {
		  userDoa.registercontact(c);
	  }

}
	