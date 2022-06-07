package com.lt.crs.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import com.lt.crs.application.CrsApplication;
import com.lt.crs.bean.Admin;
import com.lt.crs.exception.CourseNotFound;
import com.lt.crs.exception.InvalidPaymentException;




/**
 * @author user
 * 
 * This class provides the functionality for admin tasks.
 * 
 * Methods used:
 * 
 * addProfessor() 	
approveStudents()  
addCourse()  
removeCourse()       --> used to remove the courses
generateReportCard()       --> used to generate the Report Card
 *
 */

public class AdminServiceDao implements AdminServiceDaoInterface
{	
	
	/**
	 *This method is used to add the professor;
	 */
	public void addProfessor()
	{
		
		Map<Integer, String> professordetails = (Map<Integer, String>) new HashMap<Integer, String>();
		
	       Scanner in = new Scanner(System.in);
	          System.out.println("id: ");
	           Integer courseid = in.nextInt();
	           System.out.println("name: ");
	           String pname= in.next();
	           
	           professordetails.put(courseid, pname);
	           System.out.println("Professor added successfully");      
	}
	
	
	/**
	 *This method is used to approve the students 
	 */
	public  void approveStudents() {
		
		System.out.println("Student approved\n");	
	}
	 
	Map<Integer, String> coursedetails = (Map<Integer, String>) new HashMap<Integer, String>();
	
	
	/**
	 *This method is used to add the course 
	 */
    public void addCourse() {
	
	System.out.println("These are the courses which are present: ");
	
	System.out.println(courseList());
	
	ArrayList newList = new ArrayList();
	newList =courseList();
	System.out.println("Enter the course details which has to be added: ");
	
       Scanner in = new Scanner(System.in);
         
         
          System.out.println("id: ");
           Integer courseid = in.nextInt();
           System.out.println("name: ");
           String coursename= in.next();
          
           coursedetails.put(courseid, coursename);
           
           newList.add(coursedetails.values());
           System.out.println("Course added successfully");
         
         /*  for (Map.Entry course : coursedetails.entrySet())
			{
			courseList(course.getValue());
			}*/
          System.out.println("The updated Course List: "+newList);
         
}

public ArrayList<String> courseList()
{
	 Stream<String>
     stream = Stream.of("Java", "Python", "Big Data","Cloud");
	 
	 List<String>
     list = stream.collect(Collectors.toList());
	 
     ArrayList<String>
     courselist = new ArrayList<String>(list);

     return courselist;
}


/**
 *This method is used to remove the course 
 */
	
	public void removeCourse() {
		
		System.out.println("These are the courses which are present: ");
		System.out.println(courseList());
		System.out.println("Enter the course id which has to be removed: ");
		
	
	       Scanner in = new Scanner(System.in);
	          System.out.println("id: ");
	           Integer courseid = in.nextInt();
	           System.out.println("name: ");
	           String coursename= in.next();
	           
	           
	           ArrayList coursedetails = new ArrayList();
	           coursedetails = courseList();
	           
	           if (coursename.equals("Java") || coursename.equals("Python" )|| coursename.equals("Big Data")) {
	        	   coursedetails.remove(coursename);
	           System.out.println("Course deleted successfully");
	           
	           System.out.println(coursedetails);
	       }
	       else {
	    	   
	    	   try {
					  throw new CourseNotFound("Please choose a valid course");  
					  
			      } catch(CourseNotFound e) {
			         System.out.println(e);
			      }
	       }
	           
	           //System.out.println("The Course List: "+coursedetails);
	                
	}
	
	/**
	 *This method is used to generate the report card. 
	 */

	public void generateReportCard() {
		System.out.println("GradeCard");
		System.out.println("Java - A");
		System.out.println("Python - B");
		System.out.println("Big data - A+");
		System.out.println("Cloud - A");
		
	}
	
}
