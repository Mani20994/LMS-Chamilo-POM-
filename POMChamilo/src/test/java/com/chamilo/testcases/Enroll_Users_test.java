package com.chamilo.testcases;

import org.testng.annotations.Test;

import com.chamilo.base.TestBase;
import com.chamilo.pages.Enroll_Users_page;
import com.chamilo.pages.Home_page;
import com.chamilo.pages.Login_Page;


public class Enroll_Users_test extends TestBase{

	  Login_Page loginpage;
	  Home_page homepage;
	  Enroll_Users_page enroll_users_page;
//	  Assessment_Assignment_page assessment_assignment_page;
	  String sheetName="enrollusers";
	
	  public Enroll_Users_test() {
			 super();
			}
	  
		//Admin assign assignment
	  @Test(priority=1)
		public void clickonenrollpage() throws InterruptedException {
		   initialization();
		 loginpage= new Login_Page();
		homepage = new Home_page();
		enroll_users_page= new Enroll_Users_page();
//		assessment_assignment_page = new Assessment_Assignment_page();
		Thread.sleep(2000);
		 homepage= loginpage.login(prop.getProperty("AdminUserName"), prop.getProperty("Adminpassword"));
		 Thread.sleep(2000);
		  Enroll_Users_page.clickonenrollpage(); 
		  driver.quit();
	  }
	  
	  
	  
	  
	  
//	  @Test(priority=2)
//	  public void clickonenrollpage() throws InterruptedException {
//		  Enroll_Users_page.clickonenrollpage(); 
//		  
//	  }
	  
//	  @Test(priority=3)
//		public void clickonAssessment_Assignment() throws InterruptedException {
//				 
//		 Assessment_Assignment_page.clickonAssessment_Assignment(); 
//				  
//			  }  

	//End user submit assignment  
	@Test(priority=2)
			public void clickonenrollpage1() throws InterruptedException {
			   initialization();
			 loginpage= new Login_Page();
			homepage = new Home_page();
			enroll_users_page= new Enroll_Users_page();
//			assessment_assignment_page = new Assessment_Assignment_page();
			Thread.sleep(2000);
			homepage= loginpage.login(prop.getProperty("EndUserUsername"), prop.getProperty("Enduserpassword"));
			 Thread.sleep(2000);
			 Enroll_Users_page.clickonenrollpage1();
			 driver.quit();
			 
	  } 
//	  
//	  	 	  @Test(priority=4)	 
//	  	     public void clickonenrollpage1() throws InterruptedException {
//		
//		     Enroll_Users_page.clickonenrollpage1();
//	 }
////	  
//	  	 	@Test(priority=6)
//			public void clickonAssessment_Assignment1() throws InterruptedException {
//					 
//			 Assessment_Assignment_page.clickonAssessment_Assignment1();   
//	  	 	  
//	  	 	}
//	  	 	
	  	//Admin view & correct rate  	  
	  	@Test(priority=3)
		public void clickonAssessment_Assignment() throws InterruptedException {
		   initialization();
		 loginpage= new Login_Page();
		homepage = new Home_page();
		enroll_users_page= new Enroll_Users_page();
//		assessment_assignment_page = new Assessment_Assignment_page();
		Thread.sleep(2000);
		 homepage= loginpage.login(prop.getProperty("AdminUserName"), prop.getProperty("Adminpassword"));
		 Thread.sleep(2000);
		 Enroll_Users_page.clickonAssessment_Assignment();
		 driver.quit();
  } 
//	  	  
//	  	@Test(priority=6)
//		public void clickonAssessment_Assignment11() throws InterruptedException {
//				 
//		 Assessment_Assignment_page.clickonAssessment_Assignment11(); 
//				  
//	 }  
//	  //End User view corrected assignment
		@Test(priority=4)
		public void clickonAssessment_Assignment1() throws InterruptedException {
		   initialization();
		 loginpage= new Login_Page();
		homepage = new Home_page();
		enroll_users_page= new Enroll_Users_page();
//		assessment_assignment_page = new Assessment_Assignment_page();
		Thread.sleep(2000);
		homepage= loginpage.login(prop.getProperty("EndUserUsername"), prop.getProperty("Enduserpassword"));
		 Thread.sleep(2000);
		 Enroll_Users_page.clickonAssessment_Assignment1(); 
		 driver.quit();
	  
       } 
//	  	  
//	  	@Test(priority=8)
//		public void clickonAssessment_Assignment1() throws InterruptedException {
//				 
//		 Assessment_Assignment_page.clickonAssessment_Assignment1(); 
//				  
//			  }  
	
		}
		
	  	 
