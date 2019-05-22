package com.chamilo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import com.chamilo.base.TestBase;

public class Add_Announcement extends TestBase {
	
	     public void Announcementpage() {
		 PageFactory.initElements(driver, this);
	}
	
	//Admin add the Announcement
	public static Add_Announcement clickonannouncementpage() throws InterruptedException {
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(100,1500)");
		System.out.println("scrolled Down");
		Thread.sleep(3000);

		//click on course
		driver.findElement(By.xpath("//a[contains(text(),'Networking (987)')]")).click();
		Thread.sleep(2000);
		
		//click on announcement icon
		driver.findElement(By.xpath("//img[@id='toolimage_1851938']")).click();
		Thread.sleep(2000);
				
		//click on add announcement
		driver.findElement(By.xpath("//div[@id='toolbar']//a[1]//img[1]")).click();
		Thread.sleep(2000);
				
		//click on choose recepient
		driver.findElement(By.xpath("//button[@id='choose_recipients']")).click();
		Thread.sleep(2000);
				
		//select user
		driver.findElement(By.xpath("//option[contains(text(),'Nidhi Kulkarni')]")).click();
		Thread.sleep(2000);
		
		//move user
		driver.findElement(By.xpath("//button[@id='users_rightSelected']")).click();
		Thread.sleep(2000);
		

		//subject 
				
		driver.findElement(By.xpath("//input[@id='announcement_title']")).sendKeys("Announcement16");	
		Thread.sleep(8000);
		
		//preview button
		driver.findElement(By.xpath("//a[@id='announcement_preview']")).click();
		Thread.sleep(2000);
		
		//send annoncement button
		driver.findElement(By.xpath("//button[@id='announcement_submit']")).click();
		Thread.sleep(2000);
		
		
		return  new Add_Announcement();
		
	}		
		
		//End User view Announcement
	public static Add_Announcement clickonannouncementpage1() throws InterruptedException {
		
		
		//click on course
		driver.findElement(By.xpath("//a[contains(text(),'Networking (987)')]")).click();
		Thread.sleep(2000);
		
		
		//click on announcement icon
		driver.findElement(By.xpath("//img[@id='toolimage_1851938']")).click();
		Thread.sleep(2000);
		
		
		//click on particular announcement
		driver.findElement(By.xpath("//a[contains(text(),'Announcement16')]")).click();
		Thread.sleep(2000);
	
	
		return new Add_Announcement();
	
	
	}
	

}
