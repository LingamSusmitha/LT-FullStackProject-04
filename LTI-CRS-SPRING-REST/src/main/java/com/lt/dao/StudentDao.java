package com.lt.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.glassfish.jersey.internal.inject.ParamConverters.TypeValueOf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lt.bean.Course;
import com.lt.bean.Student;

@Repository
public class StudentDao {

	@Autowired
	AdminDao admin;

	public List<Course> ViewCatalogue() {
		return admin.courses;
	}

	public List<Student> RegisterStudent(List<Student> s) {
		admin.addStudents(s);
		return s;
	}

	

	
	
	
	public Map<String, String> gradeCard(int id)
	{
		Map<String, String> g = new HashMap<String,String>();
		for(Student s :admin.students)
		{
			if(s.getId()==id)
			{
				g=s.getGrades();
			}
		}
		return g;
	}


	

	
	
	
	public void registerCourse(int id, Student student)
	{
		for(Student s:admin.students)
		{
			if(s.getId()==id)
			{
				/*
				 * s.setName(student.getName()); s.setId(student.getId());
				 */
				s.setCourse(student.getCourse());
				//s.setGradelist(student.getGradelist());
			}
		}
	}
	

}
