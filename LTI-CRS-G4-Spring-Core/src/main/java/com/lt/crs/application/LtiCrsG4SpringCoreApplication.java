package com.lt.crs.application;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.lt.crs.configuration.AdminConfig;
import com.lt.crs.configuration.AppConfig;
import com.lt.crs.configuration.ProfessorConfig;
import com.lt.crs.configuration.StudentConfig;
import com.lt.crs.exception.InvalidPasswordException;
import com.lt.crs.service.AdminService;
import com.lt.crs.service.AdminServiceInterface;
import com.lt.crs.service.ProfessorService;
import com.lt.crs.service.ProfessorServiceInterface;
import com.lt.crs.service.StudentService;
import com.lt.crs.service.StudentServiceInterface;


/**
 * Class Description:
 * This is the main application, from where the flow of execution starts. 
 * 
 * 
 * Methods Used:
 * Home()
 * loginUserRole()
 * adminLogin()
 * studentLogin()
 * professorLogin()
 * 
 * Annotations used:
 * 
 * @SpringBootApplication
 * @Configuration
 * @ComponentScan({  })
 * @EnableAutoConfiguration
 * @Import({ })
 *
 */



@SpringBootApplication
@Configuration
@ComponentScan({ "com.lt.*" })
@EnableAutoConfiguration
@Import({ AdminConfig.class, StudentConfig.class, ProfessorConfig.class, AppConfig.class })
public class LtiCrsG4SpringCoreApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(AppConfig.class);

		AdminServiceInterface admin = (AdminServiceInterface) context.getBean("AdminBean");

		
		StudentServiceInterface student = (StudentServiceInterface) context.getBean("StudentBean");

		
		ProfessorServiceInterface professor = (ProfessorServiceInterface) context.getBean("ProfessorBean");

		System.out.println("Welcome to CRS Application");
		System.out.println("1.Login\n2.New Registration\n3.Update Password\n4.Exit");
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose an Option:");
		int option = sc.nextInt();
		// switch operation
		switch (option) {

		case 1:
			loginUserRole(admin,student,professor);
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
		}
	}

	public static void home(AdminService admin, StudentService student, ProfessorService professor ) {
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
			loginUserRole(admin,student, professor);
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

public static  void loginUserRole(AdminServiceInterface admin, StudentServiceInterface student, ProfessorServiceInterface professor ) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Role :");
	String role = sc.nextLine();
	
	if (role != null && role.equals("admin")) {
		adminLogin(role, admin);
	} else if (role != null && role.equals("student")) {
		studentLogin(role,student);

	} else if (role != null && role.equals("professor")) {
		professorLogin(role,professor);

	} else {
		System.out.println("Please Enter a valid Role.\n");
		loginUserRole(admin,student,professor);
	}
}

public static  void adminLogin(String role,AdminServiceInterface admin) {
	// TODO Auto-generated method stub
	
	Map<Integer, String> admindtls = (Map<Integer, String>) new HashMap<Integer, String>() {{
	    put(101,"admin");
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
	
	for (Map.Entry admin1 : admindtls.entrySet())
	{
	if(LoginId==(int)admin1.getKey()&& Password.equals(admin1.getValue()))
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
		adminMainMenu(String.valueOf(LoginId),admin);
		
	}
	
	else if(counter ==2)
	{
		//System.out.println( "Incorrect userid or password. Please try again or Register");
		try {
			  throw new InvalidPasswordException("Incorrect Password. Please try again.");  
			  
	      } catch(InvalidPasswordException e) {
	         System.out.println(e);
	      }
		adminLogin(role,admin);
	}

}


public static void adminMainMenu(String role, AdminServiceInterface admin) {
	
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
				adminMainMenu(role,admin);
				break;
			case 2:
			    ssc1.removeCourse();
			    adminMainMenu(role,admin);
				break;
			case 3:
				ssc1.addProfessor();
				adminMainMenu(role,admin);
				break;
			case 4:
			//	approveStudentRegistration();
				ssc1.approveStudents();
				adminMainMenu(role,admin);
				break;
			case 5:
			//	generateReportCard();
				ssc1.generateReportCard();
				adminMainMenu(role,admin);
				break;
			case 6:
				System.out.println("Successfully Logged out.");
			    adminLogin(role,admin);
				break;
			default:
			//	home();
		
			}
}

public static  void studentLogin(String role,StudentServiceInterface student) {
	
	Map<Integer, String> students = (Map<Integer, String>) new HashMap<Integer, String>() {{
	    put(301,"student");
	    put(302,"xyz");
	    put(303,"lmn");
	    
	}};
	
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter login Id :");
	

    int LoginId = sc.nextInt();
	System.out.println("Enter Password :");
	String Password = sc.next();
	int counter=0;
	
	for (Map.Entry student1 : students.entrySet())
	{
	if(LoginId==(int)student1.getKey()&& Password.equals(student1.getValue()))
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
		studentMainMenu(LoginId, student);
		
		
	}
	
	else if(counter ==2)
	{
		//System.out.println( "Incorrect userid or password. Please try again or Register");
		try {
			  throw new InvalidPasswordException("Incorrect Password. Please try again.");  
			  
	      } catch(InvalidPasswordException e) {
	         System.out.println(e);
	      }
		studentLogin(role,student);
	}
}

public static  void studentMainMenu(int id,StudentServiceInterface student)
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
				studentMainMenu(id,student);
		        break;
		
		case 2:
				StudentServiceInterface ssc1 = new StudentService();
				ssc1.viewreportcard(id);
				studentMainMenu(id,student);
				break;
	
		case 3:
				StudentServiceInterface ssc2 = new StudentService();
				ssc2.viewCatalog();
				studentMainMenu(id,student);
			    break;		
			    
		case 4:
					StudentServiceInterface ssc3 = new StudentService();
					ssc3.course();
					studentMainMenu(id,student);
					break;
					
			case 5:
					StudentServiceInterface ssc4 = new StudentService();
					ssc4.payFee(id);
					studentMainMenu(id,student);
					break;
					
			case 6:
					
					System.out.println("Successfully Logged out.");
					studentLogin(String.valueOf(id),student);
					break;		
				
			}
				
			}
public static  void professorLogin(String role,ProfessorServiceInterface professor) {
	// TODO Auto-generated method stub
	
	
	Map<Integer, String> professordtls =  new HashMap<Integer, String>();
	
	professordtls.put(201,"prof");
	professordtls.put(202,"lkj");
	professordtls.put(203,"mnb");
	    
	
	
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter login Id :");
	

    int LoginId = sc.nextInt();
	System.out.println("Enter Password :");
	String Password = sc.next();
	int counter=0;
	
	for (Map.Entry professor1 : professordtls.entrySet())
	{
	if(LoginId==(int)professor1.getKey()&& Password.equals(professor1.getValue()))
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
		professorMainMenu(String.valueOf(LoginId),professor);
		
	}
	
	else if(counter ==2)
	{
		//System.out.println( "Incorrect userid or password. Please try again or Register");
		try {
			  throw new InvalidPasswordException("Incorrect Password. Please try again.");  
			  
	      } catch(InvalidPasswordException e) {
	         System.out.println(e);
	      }
		professorLogin(role,professor);
	}

}


public static void professorMainMenu(String role,ProfessorServiceInterface professor) {
	
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
				professorMainMenu(role,professor);
				break;
			case 2:
			    ssc1.viewRegisteredStudents(role);
			    professorMainMenu(role,professor);
				break;
			case 3:
				ssc1.coursesToTeach(role);
				professorMainMenu(role,professor);
				break;
			case 4:
				System.out.println("Successfully Logged out.");
				professorLogin(role,professor);
				
				break;
			default:
			//	home();
		
			}
}

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
}