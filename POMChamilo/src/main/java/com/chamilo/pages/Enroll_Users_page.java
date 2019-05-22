package com.chamilo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.chamilo.base.TestBase;

public class Enroll_Users_page extends TestBase {

	
	public void Enrollpage() {
		 PageFactory.initElements(driver, this);
	}
	
	//Admin enroll users
	public static Enroll_Users_page clickonenrollpage() throws InterruptedException {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(100,1500)");
		System.out.println("scrolled Down");
		Thread.sleep(3000);

		
		driver.findElement(By.xpath("//a[contains(text(),'Networking (987)')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@id='toolimage_1851941']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='actions']//a[1]//img[1]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='search_user_keyword']")).sendKeys("Nidhi1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='search_user_submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='btn btn-small btn-primary']")).click();
		Thread.sleep(2000);
		
//		driver.findElement(By.xpath("//a[contains(text(),'Networking (987)')]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//img[@id='toolimage_1851941']")).click();
//		Thread.sleep(2000);

//	return new Enroll_Users_page();
//	}	

     //Admin assign assessment & Assignment 
//	   public static Assessment_Assignment_page clickonAssessment_Assignment() throws InterruptedException {
		//click on back
		driver.findElement(By.xpath("//a[contains(text(),'Networking')]")).click();
		Thread.sleep(2000);
		
		
		//click on assessment
		driver.findElement(By.xpath("//img[@id='toolimage_1851947']")).click();
		Thread.sleep(2000);
		
		//click on create assessment
		driver.findElement(By.xpath("//div[@class='col-sm-6']//a[3]//img[1]")).click();
		Thread.sleep(2000);
		
		//Category Name
		driver.findElement(By.xpath("//input[@id='add_cat_form_name']")).sendKeys("Category44");
		Thread.sleep(2000);
		
		//Total weight
		driver.findElement(By.xpath("//input[@id='weight']")).sendKeys("80");
		Thread.sleep(2000);
		
		//Add to category
		driver.findElement(By.xpath("//button[@id='add_cat_form_submit']")).click();
		Thread.sleep(2000);
		
		//click on course networking
		driver.findElement(By.xpath("//a[contains(text(),'Networking')]")).click();
		Thread.sleep(4000);
		
		//Click on Assignment
		driver.findElement(By.xpath("//img[@id='toolimage_1851944']")).click();
		Thread.sleep(2000);
		
		//create assignment
		driver.findElement(By.xpath("//div[@class='actions']//a[1]//img[1]")).click();
		Thread.sleep(2000);
		
		//Assignment name
		driver.findElement(By.xpath("//input[@id='form1_new_dir']")).sendKeys("Demo Assignment");
		Thread.sleep(2000);
		
		//Advanced settings
		driver.findElement(By.xpath("//button[@id='advanced_params']")).click();
		Thread.sleep(2000);
		
		//Maximum score
		driver.findElement(By.xpath("//input[@id='form1_qualification']")).sendKeys("60");
		Thread.sleep(2000);
		
		//Add to grade book
		driver.findElement(By.xpath("//input[@id='make_calification_id']")).click();
		Thread.sleep(2000);
		
		//Select Assessment
		driver.findElement(By.xpath("//div[@id='option1']//div[@class='filter-option']")).click();
		Thread.sleep(2000);
		
		//Select assessment value
		driver.findElement(By.xpath("//div[@class='dropdown bootstrap-select show-tick form-control open']//input[@class='form-control']")).sendKeys("Category44");
		Thread.sleep(2000);
		
		//Enter the value
		driver.findElement(By.xpath("//div[@class='dropdown bootstrap-select show-tick form-control open']//input[@class='form-control']")).sendKeys(Keys.ENTER);
		
		//Weight inside assessment
		driver.findElement(By.xpath("//input[@id='form1_weight']")).sendKeys("40");
		Thread.sleep(2000);
		
		//validate
		driver.findElement(By.xpath("//button[@id='form1_submit']")).click();
		Thread.sleep(2000);
		return new Enroll_Users_page();
		}	
//	     return new Assessment_Assignment_page();
		
//		return new Enroll_Users_page();
//	
//	}	
	// End user view enrollment
	public static Enroll_Users_page clickonenrollpage1() throws InterruptedException {
		driver.findElement(By.xpath("//a[contains(text(),'Networking (987)')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@id='toolimage_1851941']")).click();		
		Thread.sleep(2000);
		
//	 return new Enroll_Users_page();	
//
//	}
	

//	//End user view & submit assignment
//	public static Assessment_Assignment_page clickonAssessment_Assignment1 () throws InterruptedException {
		
		//click on back 
		driver.findElement(By.xpath("//a[contains(text(),'Networking')]")).click();
		Thread.sleep(2000);
		
		
	    //click on assignment
		driver.findElement(By.xpath("//img[@id='toolimage_1851944']")).click();
		Thread.sleep(2000);
		
		
		//click on particular assignment
		driver.findElement(By.xpath("//a[contains(text(),'Demo Assignment')]")).click();
		Thread.sleep(2000);
				
		
		//upload my assignment button
		driver.findElement(By.xpath("//a[@class='btn-toolbar']")).click();
		Thread.sleep(2000);
			
		//upload
		driver.findElement(By.xpath("//a[@id='tabs2']")).click();
		Thread.sleep(2000);
			
		
		//upload file
		  WebElement upload=driver.findElement(By.xpath("//input[@id='form-work_file']"));
		    upload.sendKeys("E:\\Flipkart Requirements (1).docx");
		    
		    //upload button
		    driver.findElement(By.xpath("//button[@id='form-work_submitWork']")).click();
			Thread.sleep(2000);
	
//		    return new Assessment_Assignment_page();

		 return new Enroll_Users_page();
	}
//	 return new Enroll_Users_page();
	
	//Admin views the assignment
	   public static  Enroll_Users_page clickonAssessment_Assignment() throws InterruptedException {
		   
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(100,1500)");
		System.out.println("scrolled Down");
		Thread.sleep(3000);

	
		//click on course
		driver.findElement(By.xpath("//a[contains(text(),'Networking (987)')]")).click();
		Thread.sleep(2000);
				
		//click on assignment
		driver.findElement(By.xpath("//img[@id='toolimage_1851944']")).click();
		Thread.sleep(2000);
				
		//Click on particular assignment
		driver.findElement(By.xpath("//a[contains(text(),'Demo Assignment')]")).click();
		Thread.sleep(2000);
				
	
		//correct & Rate
		driver.findElement(By.xpath("//div[@class='panel panel-default']//a[2]//img[1]")).click();
		Thread.sleep(2000);
		
		//score
		driver.findElement(By.xpath("//input[@id='qualification']")).sendKeys("55");
		Thread.sleep(5000);
		
		//scrolldown
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("window.scrollBy(100,1500)");
		System.out.println("scrolled Down");
		Thread.sleep(3000);
		
//		
//		//Send mail to students
//		driver.findElement(By.xpath("//input[@id='qf_2f1cdf']")).click();
//		Thread.sleep(3000);
		
		
		//Send message
		driver.findElement(By.xpath("//button[@id='work_comment_button']")).click();
		Thread.sleep(2000);
		
             return new Enroll_Users_page();
				
		
	}
		
		//End user view score
        public static  Enroll_Users_page clickonAssessment_Assignment1 () throws InterruptedException {
		
        	
		//click on course (networking)
		
		driver.findElement(By.xpath("//a[contains(text(),'Networking (987)')]")).click();
		Thread.sleep(2000);
	
		
		//click on assignment
		driver.findElement(By.xpath("//img[@id='toolimage_1851944']")).click();
		Thread.sleep(2000);

		//click on particular assignment
		driver.findElement(By.xpath("//a[contains(text(),'Demo Assignment')]")).click();
		Thread.sleep(2000);
				
		return new Enroll_Users_page();
	
	}	
}
