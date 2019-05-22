package com.chamilo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.chamilo.base.TestBase;
import com.chamilo.pages.Home_page;
 
	
	public class Login_Page extends TestBase {
		
		@FindBy(xpath="//input[@id='login']")
		WebElement AdminUserName;

		@FindBy(xpath="//input[@id='password']")
		WebElement Adminpassword;

		@FindBy(xpath="//button[@id='form-login_submitAuth']")
		WebElement loginbtn;

		
		public Login_Page() {
			 PageFactory.initElements(driver, this); 
			 
			}

			public String validateLoginPage() {
			 return driver.getTitle();
			 }

		
			public Home_page login (String usernm, String pwd) throws InterruptedException   {
				AdminUserName.sendKeys(usernm);
			Thread.sleep(3000);
			Adminpassword.sendKeys(pwd);
			 Thread.sleep(3000);
			 loginbtn.click();
			return new Home_page() ;
			
			}
			@FindBy(xpath="//input[@id='login']")
			WebElement EndUserUsername;
			
			@FindBy(xpath="//input[@id='password']")
			WebElement Enduserpassword;
			
			@FindBy(xpath="//button[@id='form-login_submitAuth']")
			WebElement login;
			public Home_page login1(String username, String passwrd) throws InterruptedException   {
				EndUserUsername.sendKeys(username);
			Thread.sleep(3000);
			Enduserpassword.sendKeys(passwrd);
			 Thread.sleep(3000);
			 login.click();
			return new Home_page();
			
			
			}

}			
				
				
		
		
		

