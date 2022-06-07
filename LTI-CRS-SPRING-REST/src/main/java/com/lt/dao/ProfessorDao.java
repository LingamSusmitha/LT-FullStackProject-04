package com.lt.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lt.bean.Course;
import com.lt.bean.Professor;
import com.lt.bean.Student;

@Repository
public class ProfessorDao {
	
	 
	@Autowired AdminDao admin;
	
	
	public List<String> ViewStudents(int id)
	{
		List<String> names = new ArrayList<String>();
		for(Student s :  admin.students)
		{
			for(Course c : s.getCourse())
			{
				if(id== c.getId())
					names.add( s.getName());
			}
		}
		return names;
		
	}
	
	
	
	
	
	public String getCourseList(int id)
	{
		String coursename="";
		for(Professor p: admin.prof)
		{
			if(id==p.getId())
			{
				coursename=p.getCourse();	
				
			}
		}
		return coursename;
	}
	
	
	
	
	public void addGradesforStudents(int id, Student student)
	{
		for(Student s:admin.students)
		{
			if(s.getId()==id)
			{
				
				s.setGrades(student.getGrades());
				
			}
		}
	}
	
	
}
