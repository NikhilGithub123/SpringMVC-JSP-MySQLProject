package com.amdocsproject.doa;

import java.util.List;

import com.amdocsproject.model.admin;
import com.amdocsproject.model.adminlogin;
import com.amdocsproject.model.contact;
import com.amdocsproject.model.course;
import com.amdocsproject.model.feedback;
import com.amdocsproject.model.login;
import com.amdocsproject.model.user;

public interface doa {
	  void register(user user);
	  user validateUser(login login);
	  admin validateAdmin(adminlogin adminlogin);
	  void registercourse(course course);
	  List<course> viewCourses();
	  List<feedback> viewFeedbacks();
	  List<contact> viewContacts();
	  void enrolled(user user,String course_id);
	  void registerfd(feedback fd);
	  void registercontact(contact c);
};
