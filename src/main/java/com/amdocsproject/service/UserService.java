package com.amdocsproject.service;

import java.util.List;

import com.amdocsproject.model.admin;
import com.amdocsproject.model.adminlogin;
import com.amdocsproject.model.contact;
import com.amdocsproject.model.course;
import com.amdocsproject.model.feedback;
import com.amdocsproject.model.login;
import com.amdocsproject.model.user;

public interface UserService {

	void register(user user);
	
	user validateUser(login login);
	
	admin validateAdmin(adminlogin adminlogin);
	
	void registercourse(course course);
	void enrolled(user user, String course_id);
	void registerfd(feedback fd);
	void registercontact(contact c);
	List<course> viewCourses();
	List<feedback> viewFeedbacks();
	List<contact> viewContacts();

}
