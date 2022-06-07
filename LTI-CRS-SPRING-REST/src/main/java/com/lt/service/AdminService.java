package com.lt.service;

import java.util.List;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.lt.bean.Course;
import com.lt.bean.Professor;
import com.lt.bean.Student;
import com.lt.dao.AdminDao;

  
  @Service 
  public class AdminService implements AdminServiceInterface {
  
  @Autowired private AdminDao admindao;

@Override
public List<Professor> addProfessors(List<Professor> pf) {
	// TODO Auto-generated method stub
	return admindao.addProfessors(pf);
}

@Override
public List<Course> addCourses(List<Course> course) {
	// TODO Auto-generated method stub
	return admindao.addCourses(course);
}

@Override
public List<Student> addStudents(List<Student> student) {
	// TODO Auto-generated method stub
	return admindao.addStudents(student);
}

@Override
public List<Student> ViewStudents() {
	// TODO Auto-generated method stub
	return admindao.ViewStudents();
}

@Override
public List<Professor> ViewProfessors() {
	// TODO Auto-generated method stub
	return admindao.ViewProfessors();
}

@Override
public Long delete(Long id) {
	// TODO Auto-generated method stub
	return admindao.delete(id);
}

@Override
public Student generateGradeCard(int id) {
	// TODO Auto-generated method stub
	return admindao.generateGradeCard(id);
}
  
  
 
  
  }
  
 