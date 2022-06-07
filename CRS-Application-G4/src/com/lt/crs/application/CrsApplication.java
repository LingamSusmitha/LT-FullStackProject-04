package com.lt.crs.application;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.lt.crs.exception.InvalidPasswordException;
import com.lt.crs.exception.WrongOption;
import com.lt.crs.service.AdminService;
import com.lt.crs.service.AdminServiceInterface;
import com.lt.crs.service.ProfessorService;
import com.lt.crs.service.ProfessorServiceInterface;
import com.lt.crs.service.StudentService;
import com.lt.crs.service.StudentServiceInterface;


/**
 * Methods Used:
 * 
 * Home()
 * loginUserRole()
 * adminLogin()
 * studentLogin()
 * professorLogin()
 * 
 *
 */
public class CrsApplication {

	public static void main(String[] args) {
		System.out.println("Welcome to CRS Application");
		System.out.println("1.Login\n2.New Registration\n3.Update Password\n4.Exit");
		
		/*
		 * Map<Integer, String> professor = (Map<Integer, String>) new HashMap<Integer,
		 * String>() {{ put(221,"pass"); put(222,"abcd"); put(223,"pqrs");
		 * 
		 * }};
		 */
    
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose an Option:");
		int option = sc.nextInt();
		// switch operation
		switch (option) {
		
		case 1:
			loginUserRole();
			break;
			
		case 2:
			newRegistration();
			break;
			
		case 3:
			changePassword();
			break;
			
		case 4:
			// exit
			;
		}	}
	
	/**
	 *
	 *This method is used to =display the main menu options
	 */
	public static void home() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Login");
		System.out.println("2.New Registration");
		System.out.println("3.Change Password");
		System.out.println("4.Exit \n");

		System.out.println("Choose an Option:--");
		int option = sc.nextInt();
		// switch operation
		switch (option) {
		case 1:
			loginUserRole();
			break;
		case 2:
			// new registration
			break;
		case 3:
			// change password
			break;
		case 4:
			// exit
			;
		}
		
	}
	
	/**
	 *
	 *This method is restricts the user to enter a valid role from the given roles
	 */
		public static  void loginUserRole() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Role :");
			String role = sc.nextLine();
			
			if (role != null && role.equals("admin")) {
				adminLogin(role);
			} else if (role != null && role.equals("student")) {
				studentLogin(role);

			} else if (role != null && role.equals("professor")) {
				professorLogin(role);

			} else {
				System.out.println("Please Enter a valid Role.\n");
				loginUserRole();
			}
		}
		
		
		
		/**
		 *
		 *This method is used to validate the entered professor credentials
		 */
		public static  void professorLogin(String role) {
			// TODO Auto-generated method stub
			
			
			Map<Integer, String> professordtls =  new HashMap<Integer, String>();
			
			professordtls.put(201,"poi");
			professordtls.put(202,"lkj");
			professordtls.put(203,"mnb");
			    
			
			
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter login Id :");
			
		
		    int LoginId = sc.nextInt();
			System.out.println("Enter Password :");
			String Password = sc.next();
			int counter=0;
			
			for (Map.Entry professor : professordtls.entrySet())
			{
			if(LoginId==(int)professor.getKey()&& Password.equals(professor.getValue()))
			{

			counter=1;
			break;

			}
			else
			counter =2;
			}
			
			if(counter==1)
			{
				System.out.println("Logged in successfully!");
				LocalDateTime localDateTime = LocalDateTime.now();
				System.out.println("Logged in at:  " + localDateTime);
				professorMainMenu(String.valueOf(LoginId));
				
			}
			
			else if(counter ==2)
			{
				//System.out.println( "Incorrect userid or password. Please try again or Register");
				try {
					  throw new InvalidPasswordException("Incorrect Password. Please try again.");  
					  
			      } catch(InvalidPasswordException e) {
			         System.out.println(e);
			      }
				professorLogin(role);
			}

		}
		/**
		 *
		 *This method is used to validate the entered admin credentials
		 */
			
			public static  void adminLogin(String role) {
				// TODO Auto-generated method stub
				
				Map<Integer, String> admindtls = (Map<Integer, String>) new HashMap<Integer, String>() {{
				    put(101,"klm");
				    put(102,"nop");
				    put(103,"qrs");
				    
				}};
				
				// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter login Id :");
				
			
			    int LoginId = sc.nextInt();
				System.out.println("Enter Password :");
				String Password = sc.next();
				int counter=0;
				
				for (Map.Entry student : admindtls.entrySet())
				{
				if(LoginId==(int)student.getKey()&& Password.equals(student.getValue()))
				{

				counter=1;
				break;

				}
				else
				counter =2;
				}
				
				if(counter==1)
				{
					System.out.println("Logged in successfully!");
					LocalDateTime localDateTime = LocalDateTime.now();
					System.out.println("Logged in at:  " + localDateTime);
					adminMainMenu(String.valueOf(LoginId));
					
				}
				
				else if(counter ==2)
				{
					//System.out.println( "Incorrect userid or password. Please try again or Register");
					try {
						  throw new InvalidPasswordException("Incorrect Password. Please try again.");  
						  
				      } catch(InvalidPasswordException e) {
				         System.out.println(e);
				      }
					adminLogin(role);
				}

			}
			/**
			 *
			 *This method is used to validate the entered student credentials
			 */
			
			public static  void studentLogin(String role) {
				
				Map<Integer, String> students = (Map<Integer, String>) new HashMap<Integer, String>() {{
				    put(123,"abc");
				    put(124,"xyz");
				    put(125,"lmn");
				    
				}};
				
				// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter login Id :");
				
			
			    int LoginId = sc.nextInt();
				System.out.println("Enter Password :");
				String Password = sc.next();
				int counter=0;
				
				for (Map.Entry student : students.entrySet())
				{
				if(LoginId==(int)student.getKey()&& Password.equals(student.getValue()))
				{

				counter=1;
				break;

				}
				else
				counter =2;
				}
				
				if(counter==1)
				{
					System.out.println("Logged in successfully!");
					LocalDateTime localDateTime = LocalDateTime.now();
					System.out.println("Logged in at:  " + localDateTime);
					studentMainMenu(LoginId);
					
					
				}
				
				else if(counter ==2)
				{
					//System.out.println( "Incorrect userid or password. Please try again or Register");
					try {
						  throw new InvalidPasswordException("Incorrect Password. Please try again.");  
						  
				      } catch(InvalidPasswordException e) {
				         System.out.println(e);
				      }
					studentLogin(role);
				}
			}
			
			/**
			 *
			 *This method is used to display the student menu options
			 */

public static  void studentMainMenu(int id)
{
			
		System.out.println("Menu");
		System.out.println("1.Register a Course\n2.View GradeCard\n3.View Catalog\n4.Add/Delete Course \n5.Pay Fee\n6.Logout");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		switch(input) {
		
		case 1:
				StudentServiceInterface ssc = new StudentService();
				ssc.viewCatalog();
				System.out.println("Please select the Course\n");
				int inp = sc.nextInt();
				ssc.registerCourse(inp);
				studentMainMenu(id);
		        break;
		
		case 2:
				StudentServiceInterface ssc1 = new StudentService();
				ssc1.viewreportcard(id);
				studentMainMenu(id);
				break;
	
		case 3:
				StudentServiceInterface ssc2 = new StudentService();
				ssc2.viewCatalog();
				studentMainMenu(id);
			    break;
	
		case 4:
				StudentServiceInterface ssc3 = new StudentService();
				ssc3.course();
				studentMainMenu(id);
				break;
				
		case 5:
				StudentServiceInterface ssc4 = new StudentService();
				ssc4.payFee(id);
				studentMainMenu(id);
				break;
				
		case 6:
				
				System.out.println("Successfully Logged out.");
				studentLogin(String.valueOf(id));
				break;		
			
		}
			
		}
/**
*
*This method is used to display the admin menu options
*/


public static void adminMainMenu(String role) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("\n1. Add Course");
	System.out.println("2. Remove Course");
	System.out.println("3. Add Professor");
	System.out.println("4. Approve Student Registration");
	System.out.println("5. Generate Report Card");
	System.out.println("6. Logout \n");

	System.out.println("select an Option :");
	int option = sc.nextInt();
	
	AdminServiceInterface ssc1 = new AdminService();
	
			switch (option) {
			case 1:
				
				ssc1.addCourse();
				adminMainMenu(role);
				break;
			case 2:
			    ssc1.removeCourse();
			    adminMainMenu(role);
				break;
			case 3:
				ssc1.addProfessor();
				adminMainMenu(role);
				break;
			case 4:
			//	approveStudentRegistration();
				ssc1.approveStudents();
				adminMainMenu(role);
				break;
			case 5:
			//	generateReportCard();
				ssc1.generateReportCard();
				adminMainMenu(role);
				break;
			case 6:
				System.out.println("Successfully Logged out.");
			    adminLogin(role);
				break;
			default:
			//	home();
		
			}
}
/**
*
*This method is used to display the professor menu options
*/

public static void professorMainMenu(String role) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("\n1. Add Grades");
	System.out.println("2. View Registered Students");
	System.out.println("3. Courses to teach");
	System.out.println("4. Logout \n");

	System.out.println("select an Option :");
	int option = sc.nextInt();
	
	ProfessorServiceInterface ssc1 = new ProfessorService();
	
			switch (option) {
			case 1:
				
				ssc1.addGrades(role);
				professorMainMenu(role);
				break;
			case 2:
			    ssc1.viewRegisteredStudents(role);
			    professorMainMenu(role);
				break;
			case 3:
				ssc1.coursesToTeach(role);
				professorMainMenu(role);
				break;
			case 4:
				System.out.println("Successfully Logged out.");
				professorLogin(role);
				
				break;
			default:
			//	home();
		
			}
}
/**
*
*This method is used to change the current password
*/

		public static void changePassword()
		{
			System.out.println("Enter the current password: ");
			Scanner sc = new Scanner(System.in);
			int cp = sc.nextInt();
			System.out.println("Enter the new password: ");
			int np = sc.nextInt();
			System.out.println("Re-Enter the new password: ");
			int nnp = sc.nextInt();
			
			if(np==nnp)
			{
				System.out.println("The password has been changed successfully");
			}
			
			else {
				System.out.println("Password has not been changed. Please try again");
			}
		}
		
		/**
		 *
		 *This method is used to register a new user
		 */

		public static void newRegistration()
		{
		System.out.println("Enter the below details to register");
		Scanner sc = new Scanner(System.in);
		System.out.print("Name : ");
		String name=sc.next();
		System.out.println("Branch : ");
		String branch= sc.next();
		System.out.print("Role : ");
		String r=sc.next();
		System.out.print("Password : ");
		String pass=sc.next();
		
		
		System.out.println("Registered Successfully");
		}
		
		}

// }
