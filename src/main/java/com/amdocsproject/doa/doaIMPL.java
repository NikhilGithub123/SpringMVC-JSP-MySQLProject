package com.amdocsproject.doa;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.amdocsproject.model.admin;
import com.amdocsproject.model.adminlogin;
import com.amdocsproject.model.contact;
import com.amdocsproject.model.course;
import com.amdocsproject.model.feedback;
import com.amdocsproject.model.login;
import com.amdocsproject.model.user;

public class doaIMPL implements doa{

	  @Autowired
	  DataSource datasource;

	  @Autowired
	  JdbcTemplate jdbcTemplate;

	  public void register(user user) {

	    String sql = "insert into users values(?,?,?,?,?,?)";

	    jdbcTemplate.update(sql, new Object[] { user.getUid(), user.getName(), user.getEmail(), user.getPwd(),
	    user.getPhone(), user.getAddress()});
	    }	
	  
	  public void registercourse(course course) {
		  String sql="insert into courses values(?,?,?,?)";
		  jdbcTemplate.update(sql, new Object[] { course.getCid(),course.getCname(),course.getCdesc(),course.getCfees()});
	  }
	  public user validateUser(login login) {

		    String sql = "select * from users where name='" + login.getUsername() + "' and pwd='" + login.getPwd()
		    + "'";

		    List<user> users = jdbcTemplate.query(sql, new UserMapper());

		    return users.size() > 0 ? users.get(0) : null;
		    }
	  
	  public admin validateAdmin(adminlogin adminlogin) {
		  
		    String sql = "select * from admins where name='" + adminlogin.getUsername() + "' and pwd='" + adminlogin.getPwd()
		    + "'";
		    List<admin> admins = jdbcTemplate.query(sql, new AdminMapper());
		    return admins.size() > 0 ? admins.get(0) : null;
	  }
	  
	  public List<course> viewCourses(){
		  String sql="select * from courses";
		  List<course> courses=jdbcTemplate.query(sql, new CourseMapper());
		  return courses;
	  }
	  
	  
	  public List<feedback> viewFeedbacks(){
		  String sql="select * from feedback";
		  List<feedback> feedbacks=jdbcTemplate.query(sql, new FeedbackMapper());
		  return feedbacks;
	  }
	  
	  public List<contact> viewContacts(){
		  String sql="select * from contact";
		  List<contact> contacts=jdbcTemplate.query(sql, new ContactMapper());
		  return contacts;
	  }
	  public void enrolled(user user,String course_id) {
		  
		    String sql = "insert into enrolled values(?,?)";
		    jdbcTemplate.update(sql, new Object[] { user.getUid(),course_id});
	  }
	  public void registerfd(feedback fd) {
		  String sql="insert into feedback values (?,?,?,?)";
		  jdbcTemplate.update(sql, new Object[] { fd.getUid(),fd.getName(),fd.getEmail(),fd.getFd()});
	  }
	  
	  public void registercontact(contact c) {
		  String sql="insert into contact values (?,?,?,?,?)";
		  jdbcTemplate.update(sql, new Object[] { c.getUid(),c.getName(),c.getEmail(),c.getPhone(),c.getMessage()});
	  }
} 



class FeedbackMapper implements RowMapper<feedback>{
	public feedback mapRow(ResultSet rs, int arg1) throws SQLException {
		  feedback fd = new feedback();

		  fd.setUid(rs.getString("uid"));
		  fd.setName(rs.getString("name"));
		  fd.setEmail(rs.getString("email"));
		  fd.setFd(rs.getString("fd"));

		  return fd;
		}
}

class ContactMapper implements RowMapper<contact> {

public contact mapRow(ResultSet rs, int arg1) throws SQLException {
	contact contact = new contact();

	contact.setUid(rs.getString("uid"));
	contact.setName(rs.getString("name"));
	contact.setEmail(rs.getString("email"));
	contact.setPhone(rs.getString("phone"));
	contact.setMessage(rs.getString("message"));

  return contact;
}
}


class CourseMapper implements RowMapper<course> {

public course mapRow(ResultSet rs, int arg1) throws SQLException {
  course course = new course();

  course.setCid(rs.getString("cid"));
  course.setCname(rs.getString("cname"));
  course.setCdesc(rs.getString("cdesc"));
  course.setCfees(rs.getString("cfees"));

  return course;
}
}

class UserMapper implements RowMapper<user> {

public user mapRow(ResultSet rs, int arg1) throws SQLException {
  user user = new user();

  user.setUid(rs.getInt("uid"));
  user.setName(rs.getString("name"));
  user.setEmail(rs.getString("email"));
  user.setPwd(rs.getString("pwd"));
  user.setPhone(rs.getString("phone"));
  user.setAddress(rs.getString("address"));

  return user;
}
}

class AdminMapper implements RowMapper<admin> {

public admin mapRow(ResultSet rs, int arg1) throws SQLException {
  admin admin = new admin();

  admin.setAid(rs.getString("Aid"));
  admin.setName(rs.getString("name"));
  admin.setEmail(rs.getString("email"));
  admin.setPwd(rs.getString("pwd"));

  return admin;
}
}
