package com.lt.crs.dao;

import java.util.ArrayList;



import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;


import com.lt.crs.exception.InvalidPasswordException;
import com.lt.crs.exception.InvalidPaymentException;
import com.lt.crs.exception.WrongOption;


 /**
  * Purpose:
 * This class has the functionality of the tasks performed by student 
 * 
 * Methods used:
 * 
 * registerCourse() --> used to register the courses;	
viewreportcard() --> used to view the ReportCard  
viewCatalog()  --> used to view Course Catalog
payFee()       --> used to make the payments
course()       --> used to add or delete the courses */

 
public class StudentServiceDao implements StudentServiceDaoInterface {

	
	/**
	 *
	 *This method is used to register a course
	 *@Param course id
	 */
	public void registerCourse(int inp) {

		if (inp == 1) {
			System.out.println("Successfully Registered for Java Course");
		} else if (inp == 2) {
			System.out.println("Successfully Registered for Python Course");
		} else if (inp == 3) {
			System.out.println("Successfully Registered for Big data Course");
		} else if (inp == 4) {
			System.out.println("Successfully Registered for Cloud Course");
		}
		else if(inp >4)
		{
			try {
				  throw new WrongOption("Wrong Option Chosen. Choose the valid option.");    
		      } catch(WrongOption e) {
		         System.out.println(e);
		      }
		}

	}

	/**
	 *
	 *This method is used to view the report card
	 */
	public ArrayList viewreportcard(int i) {

		ArrayList<String> datalist = new ArrayList<String>();

		if (i == 123) {

			datalist.add("Java - A");
			datalist.add("Python - B");
			datalist.add("Big data - A+");
			datalist.add("Cloud - A");

		} else if (i == 124) {

			datalist.add("Java - B");
			datalist.add("Python - B");
			datalist.add("Big data - D+");
			datalist.add("Cloud - A");

		} else if (i == 125) {

			datalist.add("Java - C");
			datalist.add("Python - B");
			datalist.add("Big data - C+");
			datalist.add("Cloud - A");

		} else if (i == 3) {

			datalist.add("Java - D");
			datalist.add("Python - B");
			datalist.add("Big data - A+");
			datalist.add("Cloud - A");

		} else if (i == 4) {

			datalist.add("Java - A");
			datalist.add("Python - C");
			datalist.add("Big data - B+");
			datalist.add("Cloud - A");

		}
		return datalist;
	}

	
	
	/**
	 *
	 *This method is used to view the  course catalogue
	 */
	public ArrayList viewCatalog() {

		/*
		ArrayList datalist = new ArrayList();

		datalist.add("Java");
		datalist.add("Python");
		datalist.add("Big data");
		datalist.add("Cloud");

		return datalist;
	
		*/
		
		
		 Stream<String>
         stream = Stream.of("Java", "Python", "Big Data","Cloud");
		 
		 List<String>
         list = stream.collect(Collectors.toList());

    
     ArrayList<String>
         arrayList = new ArrayList<String>(list);

     return arrayList;

	}
	/**
	 *
	 *This method is used to add/delete a course
	 */
	public ArrayList course() {
		
		ArrayList<String> courselist = new ArrayList<String>( Arrays. asList( "Java" , "Python" , "Big Data", "Cloud" ) );
		ArrayList courses = new ArrayList();
		viewCatalog();

		System.out.println("If you want to add course, press 1");

		System.out.println("If you want to  delete course, press 2");

		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
		
			while(choice==1)
			{
			System.out.println("1. Enter 1 to add Java");
			System.out.println("2. Enter 2 to add Python");
			System.out.println("3. Enter 3 to add Big Data");
			System.out.println("4. Enter 4 to add Cloud");
			System.out.println("5. Enter 5 to see the list of Courses added");
			System.out.println("6. Enter 6 to go back");
			
			int course = sc.nextInt();
			int i=0;
			
			switch(course)
			{
			case 1:
				courses.add("Java");
				System.out.println("Java added successfully ");

				break;
			case 2:
				courses.add("Python");
				System.out.println("Python added successfully ");

				break;	
			case 3:
				courses.add("Big Data");
				System.out.println("Big Data added successfully ");

				break;
			case 4:
				courses.add("Cloud");
				System.out.println("Cloud added successfully ");

				break;
				
			case 5:
				//c.forEach(a -> System.out.println(a));  
				courses.forEach(System.out::println);
				break;
			case 6:	
				i=1;
				break;
			}
			
		
		if(i==1)
		{
			break;
		}
			
		}
			//System.out.println("1.Register a Course\n2.View GradeCard\n3.View Catalog\n4.Add/Delete Course \n5.Pay Fee");
			
			
		
		
			while(choice==2)
			{
				
				int i=0;
			System.out.println("If you want to remove Java course, press 1");
			System.out.println("If you want to remove Python course, press 2");
			System.out.println("If you want to remove Big Data course, press 3");
			System.out.println("If you want to remove Cloud course, press 4");
			System.out.println("If you want to see the current courses, press 5");
			System.out.println("If you want to exit, press 6");

			int course = sc.nextInt();
            
			switch(course)
			{
			case 1:
				courses.remove("Java");
				System.out.println("Java removed successfully ");

				break;
			case 2:
				courses.remove("Python");
				System.out.println("Python removed successfully ");

				break;	
			case 3:
				courses.remove("Big Data");
				System.out.println("Big Data removed successfully ");

				break;
			case 4:
				courses.remove("Cloud");
				System.out.println("Cloud removed successfully ");

				break;
				
			case 5:
				//System.out.println(c);
				courses.forEach(b -> System.out.println(b));  
				break;
			case 6:
				i=1;
				break;
			
			}
			if(i==1)
			{
				break;
			}
			
		}
		
		//	System.out.println("1.Register a Course\n2.View GradeCard\n3.View Catalog\n4.Add/Delete Course \n5.Pay Fee");
			
		return courses;
		
		
		}
		
		
		
		
		
		/*
		System.out.println("If you want to add course, press 1");

		System.out.println("If you want to  delete course, press 2");

		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();

		while (choice == 1) {

			System.out.println("1. Enter 1 to add Java");
			System.out.println("2. Enter 2 to add Python");
			System.out.println("3. Enter 3 to add Big Data");
			System.out.println("4. Enter 4 to add Cloud");
			System.out.println("5. Enter 5 to see the list of Courses added");
			System.out.println("6. Enter 6 to go back");

			int course = sc.nextInt();
			if (course == 1) {
				c.add("Java");
				System.out.println("Java added successfully ");

			}
			if (course == 2) {
				c.add("Python");
				System.out.println("Python added successfully ");

			}
			if (course == 3) {
				c.add("Big Data");
				System.out.println("Big Data  added successfully ");

			}
			if (course == 4) {
				c.add("Cloud");
				System.out.println("Cloud added successfully ");

			}
			if (course == 5) {
				System.out.println(c);
			}
			if (course == 6) {
				System.out.println("1.Register a Course\n2.View GradeCard\n3.View Catalog\n4.Add/Delete Course \n5.Pay Fee");
				
			}
		}

		while (choice == 2) {
			System.out.println("If you want to remove Java course, press 1");
			System.out.println("If you want to remove Python course, press 2");
			System.out.println("If you want to remove Big Data course, press 3");
			System.out.println("If you want to remove Cloud course, press 4");
			System.out.println("If you want to see the current courses, press 5");
			System.out.println("If you want to exit, press 6");

			int course = sc.nextInt();

			if (course == 1) {
				c.remove("Java");
				System.out.println("Java removed successfully ");
			}
			if (course == 2) {
				c.remove("Python");
				System.out.println("Python removed successfully");
			}
			if (course == 3) {
				c.remove("Big Data");
				System.out.println("Big Data added successfully ");
			}
			if (course == 4) {
				c.remove("Cloud");
				System.out.println("Cloud removed successfully ");
			}

			if (course == 5) {
				System.out.println(c);
			}
			if (course == 6) {
				System.out.println("1.Register a Course\n2.View GradeCard\n3.View Catalog\n4.Add/Delete Course \n5.Pay Fee");
				
			}
			// System.out.println(" Courses : "+c);

		}
		return c;
*/
	

		/* @Param f
		 * @throw InvalidPaymentException
		 *  
		 *  
		 *  */
	/**
	 *
	 *This method is used to view the fee and check the payment options 
	 */

	public void viewFee(int f) {
		if (f == 10) {
			System.out.println("Fee which has been payed: Rs.0");
			System.out.println("Total Fee to be payed : Rs.1,00,000");

		}

		else if (f == 1)

		{

			System.out.println("Fee which has been payed: Rs.80,000");
			System.out.println("Total Fee to be payed : Rs.20,000");
		} else if (f == 2)

		{

			System.out.println("Fee which has been payed: Rs.65,000");
			System.out.println("Total Fee to be payed : Rs.35,000");
		}

		else if (f == 3)

		{

			System.out.println("Fee which has been payed: Rs.90,000");
			System.out.println("Total Fee to be payed : Rs.10,000");
		}

		else if (f == 4)

		{

			System.out.println("Fee which has been payed: Rs.70,000");
			System.out.println("Total Fee to be payed : Rs.30,000");
		}
		System.out.println("Press 1 to pay the Fee");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();

		if (input == 1) {

			System.out.println("Select the payment methods:\n1.Credit/Debit Card\n2.UPI\n3.Bank Transfer");
			int p = sc.nextInt();
			if (p == 1) {
				System.out.println("Enter Card Details");
				System.out.println("Enter Card Number: ");
				String cn = sc.next();
				if (cn.length() !=12) {
					System.out.println("Please Enter the valid card number ");

				}
				String cn1 = sc.next();
				System.out.println("Enter the expiry in mmyy format: ");
				int cm = sc.nextInt();
				System.out.println("Enter CVV: ");
				int cv = sc.nextInt();
				payFee();

			}
			else if (p == 2) {
				System.out.println("Enter UPI ID");
				int upi = sc.nextInt();
				payFee();
			}

			else if (p == 3) {
				System.out.println("Enter the bank account details:");
				int b = sc.nextInt();
				payFee();
			}
			
			else if(p<1 || p>3)
			{
				try {
					  throw new InvalidPaymentException("Please choose a right payment method");  
					  
			      } catch(InvalidPaymentException e) {
			         System.out.println(e);
			      }
			}
			
		}
	}
	/**
	 *
	 *This method is used to let the user know that payment was made successfully
	 */
	public void payFee() {
		System.out.println("The Payment had been made successfully.");
	}
}
