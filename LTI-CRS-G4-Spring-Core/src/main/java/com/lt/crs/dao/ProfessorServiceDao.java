package com.lt.crs.dao;

import java.util.ArrayList;

/**
 * 
 * Purpose:
 * This class has the functionality of the tasks performed by professor 
 * Methods Used:
 * 
 * addGrades
 * viewRegisteredStudentsforCourse
 * getCourseList
 * 
 *
 */
public class ProfessorServiceDao implements ProfessorServiceDaoInterface
{
	
	/**
	 * This method is used to add the grades
	 * @Param  course, student, Grade
	 */
	public String addGrades(String course, String student, String Grade)
	{
		
		ArrayList<String> datalist = viewRegisteredStudentsforCourse(course);
		
		int studentid = Integer.parseInt(student);
		
		//String studentname = (String)datalist.get(studentid+1);
		String studentname = (String)datalist.get(studentid-1);
		String resultMsg ="Successfully added grade "+Grade+" for "+studentname;
		
		return resultMsg;
	}
	/**
	 * This method is used to view the list of registered students
	 * @Param CourseId
	 */
	public ArrayList viewRegisteredStudentsforCourse(String CourseId)
	{
		ArrayList<String> datalist = new ArrayList<String>();

		if (CourseId.equals("1")) {

			datalist.add("Jack");
			datalist.add("Harry");
			datalist.add("Peter");
			datalist.add("Bob");

		} else if (CourseId.equals("2")) {

			datalist.add("Alex");
			datalist.add("Marley");
			datalist.add("Jessy");
			datalist.add("Chloe");

		} else if (CourseId.equals("3")) {

			datalist.add("Maxwell");
			datalist.add("Warner");
			datalist.add("Kane");
			datalist.add("Umran");

		} else if (CourseId.equals("4")) {

			datalist.add("Roger");
			datalist.add("Lisa");
			datalist.add("Hayden");
			datalist.add("Willian");

		} 
		return datalist;
	}
	
	/**
	 * This method is used to get the course list
	 * @Param LoginId
	 */
	public ArrayList getCourseList(String LoginId)
	{
		ArrayList dataList = new ArrayList();
		ArrayList tempList = new ArrayList();
		
		if(LoginId.equals("201")) {
			tempList.add("1");
			tempList.add(".Java");
			dataList.add(tempList);
			
			tempList = new ArrayList();
			
			tempList.add("2");
			tempList.add(".Python");
			dataList.add(tempList);
			
		}else if(LoginId.equals("202")) {
			
			tempList.add("2");
			tempList.add(".Python");
			dataList.add(tempList);
			
			tempList = new ArrayList();
			
			tempList.add("3");
			tempList.add(".Big Data");
			dataList.add(tempList);
			
		}else if(LoginId.equals("203")) {
			
			tempList.add("3");
			tempList.add(".Big Data");
			dataList.add(tempList);
			
			tempList = new ArrayList();
			
			tempList.add("4");
			tempList.add(".Cloud");	
			dataList.add(tempList);
		}
		
		return dataList ;
		
	}

}
