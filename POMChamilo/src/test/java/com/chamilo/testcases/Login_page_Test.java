package com.chamilo.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.chamilo.base.TestBase;
import com.chamilo.pages.Home_page;
import com.chamilo.pages.Login_Page;


	public class Login_page_Test extends  TestBase {
		Login_Page loginpage;
	  Home_page homepage;
		public Login_page_Test() {
		 super();
		}

		 @BeforeMethod
		public void setUp() {
		   initialization();
		 loginpage= new Login_Page();
		homepage = new Home_page();
		}
		 

	 @Test(priority=1)
		 public void loginTest() throws InterruptedException {
		Thread.sleep(2000);
			 homepage= loginpage.login(prop.getProperty("AdminUserName"), prop.getProperty("Adminpassword"));
		 }
  
		
		 
		 @Test(priority=2)
		 public void loginTest1() throws InterruptedException {
		 homepage= loginpage.login(prop.getProperty("EndUserUsername"), prop.getProperty("Enduserpassword"));
		 }
		 
		}

	//@AfterMethod
			//public void tearDown() {
			 //driver.quit();
			//}
			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
