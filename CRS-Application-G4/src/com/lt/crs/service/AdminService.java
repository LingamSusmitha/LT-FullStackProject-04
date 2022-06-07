package com.lt.crs.service;

import java.util.HashMap;
import java.util.Scanner;

import com.lt.crs.bean.Admin;
import com.lt.crs.dao.AdminServiceDao;
import com.lt.crs.dao.StudentServiceDao;


public class AdminService implements AdminServiceInterface{

	
	public void addProfessor() {
		AdminServiceDao ssd = new AdminServiceDao();
		ssd.addProfessor();
		
	}
	
	public void approveStudents()
	{
		AdminServiceDao ssd = new AdminServiceDao();
		ssd.approveStudents();
	}
	
	public void generateReportCard()
	{
		AdminServiceDao ssd = new AdminServiceDao();
		ssd.generateReportCard();
	}
	public void addCourse(){
		AdminServiceDao ssd = new AdminServiceDao();
		ssd.addCourse();		
	}

	public void removeCourse() {
		AdminServiceDao ssd = new AdminServiceDao();
		ssd.removeCourse();
	}
}