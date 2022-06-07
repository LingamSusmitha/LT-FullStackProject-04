package com.lt.crs.service;

import java.util.ArrayList;

import com.lt.crs.dao.StudentServiceDao;

public class StudentService implements StudentServiceInterface {
public void registerCourse(int input){
		
		StudentServiceDao ssd = new StudentServiceDao();
		ssd.registerCourse(input);
		
		// StudentServiceDao s1=(input)->{   };  

	}
	
    public void viewreportcard(int id){
    	
    	int i =id;
    	StudentServiceDao ssd = new StudentServiceDao();
    	ArrayList dataList = (ArrayList)ssd.viewreportcard(i);
    	
    	for(int j=0; j<dataList.size();j++) {
    		System.out.println(j+1+"."+dataList.get(j));
    	}
    	
	}
    
    public void viewCatalog(){
    	
    	StudentServiceDao ssd = new StudentServiceDao();
    	ArrayList resultlist = (ArrayList)ssd.viewCatalog();
    	
    	System.out.println(" Courses:");
    	for(int i=0;i<resultlist.size();i++){
    		System.out.println(i+1+"."+resultlist.get(i));
    	}
    	
    	
    }
  public void payFee(int i){
    	
	    int f = i;
    	StudentServiceDao ssd = new StudentServiceDao();
    	ssd.viewFee(f);
	}

@Override
public void course() {
	// TODO Auto-generated method stub
	StudentServiceDao ssd = new StudentServiceDao();
	
	ArrayList a = new ArrayList();
	a=ssd.course();
	//return a;
	
}
}

