package com.lt.crs.exception;

public class CourseNotFound extends RuntimeException {

	public  CourseNotFound(String errorMessage)
	{
		  super(errorMessage);  
	}
}
