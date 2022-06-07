package com.lt.crs.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.lt.crs.dao.ProfessorServiceDao;
import com.lt.crs.dao.ProfessorServiceDaoInterface;

public class ProfessorService implements ProfessorServiceInterface {

	public void addGrades(String loginId)
	{
		ProfessorServiceDaoInterface profObj = new ProfessorServiceDao();
		
		//viewRegisteredStudents(loginId);
		System.out.println("List of Courses");
		System.out.println("-----------------------");
		coursesToTeach(loginId);
		Scanner sc = new Scanner(System.in);
		System.out.println("Select the Course:--");
		int course = sc.nextInt();
		
		ArrayList resultList = profObj.viewRegisteredStudentsforCourse(String.valueOf(course));
		
		//resultList.stream().forEach(System.out::println);
		System.out.println("List of Students");
		System.out.println("-----------------------");
		for(int i=0;i<resultList.size();i++) {
			System.out.println(i+1+"."+resultList.get(i));
		}
		
		System.out.println("Select the Student:--");
		int student = sc.nextInt();
		
		System.out.println("Enter the Grade:--");
		String grade= sc.next();
		
		String resultmsg = (String)profObj.addGrades(String.valueOf(course), String.valueOf(student), grade);
		
		System.out.println(resultmsg);
			
	}
	
	public void viewRegisteredStudents(String loginId)
	{
		ProfessorServiceDaoInterface profObj = new ProfessorServiceDao();
		System.out.println("List of Courses");
		System.out.println("-----------------------");
		coursesToTeach(loginId);
		Scanner sc = new Scanner(System.in);
		System.out.println("Select the Course:--");
		int course = sc.nextInt();
		
		ArrayList resultList = profObj.viewRegisteredStudentsforCourse(String.valueOf(course));
		
		//resultList.stream().forEach(System.out::println);
		System.out.println("List of Students");
		System.out.println("-----------------------");
		for(int i=0;i<resultList.size();i++) {
			System.out.println(i+1+"."+resultList.get(i));
		}
	}
	
	public void coursesToTeach(String loginId)
	{
		ProfessorServiceDaoInterface profObj = new ProfessorServiceDao();	
		ArrayList resultList = (ArrayList)profObj.getCourseList(loginId);
		
		for(int i=0;i<resultList.size();i++) {
			
			ArrayList innerList = new ArrayList();
			innerList = (ArrayList)resultList.get(i);
			
			System.out.print("\n");
			
			for(int j=0;j<innerList.size();j++) {
			   System.out.print(innerList.get(j));
			}
		}
		System.out.print("\n");
	}
}
