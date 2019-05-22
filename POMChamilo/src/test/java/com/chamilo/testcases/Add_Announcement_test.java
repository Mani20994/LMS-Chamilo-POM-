package com.chamilo.testcases;

import org.testng.annotations.Test;

import com.chamilo.base.TestBase;
import com.chamilo.pages.Add_Announcement;
import com.chamilo.pages.Home_page;
import com.chamilo.pages.Login_Page;

public class Add_Announcement_test extends TestBase {
	
	Login_Page loginpage;
	  Home_page homepage;
	Add_Announcement add_announcement;
	
	  public Add_Announcement_test () {
			 super();
			}
	
	  @Test(priority=1)
		public void clickonannouncementpage() throws InterruptedException {
		   initialization();
		 loginpage= new Login_Page();
		homepage = new Home_page();
		add_announcement = new Add_Announcement();
		Thread.sleep(2000);
		 homepage= loginpage.login(prop.getProperty("AdminUserName"), prop.getProperty("Adminpassword"));
		 Thread.sleep(2000);
		 Add_Announcement.clickonannouncementpage();
		  driver.quit();
	  }
	
	  @Test(priority=2)
		public void clickonannouncementpage1() throws InterruptedException {
		   initialization();
		 loginpage= new Login_Page();
		homepage = new Home_page();
		add_announcement = new Add_Announcement();
		Thread.sleep(2000);
		homepage= loginpage.login(prop.getProperty("EndUserUsername"), prop.getProperty("Enduserpassword"));
		 Thread.sleep(2000);
		 Add_Announcement.clickonannouncementpage1();
		 
		 driver.quit();
		 
} 
	  	

}
