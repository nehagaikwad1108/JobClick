package MyExample.MyExample;

import java.io.File;
import java.io.IOException;


import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import junit.framework.Assert;

public class AppTest {
	
static ExtentReports reports;
 ExtentTest test;
 static WebDriver driver = null;
 String screenShotPath;
 
 @Before
 public void openBrowser() throws InterruptedException{
	System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	 driver = new ChromeDriver();
	 //driver = new FirefoxDriver();
	 driver.manage().window().maximize(); 
 
}
@Test
public void hello0() throws InterruptedException {
	
	try {
		
		// create account and signup flow.
		driver.get("file:///C:/Users/shubhi/Documents/Axure/Testing1/signup.html");
		WebElement element = driver.findElement(By.id("u1927_input"));
		element.sendKeys("developer");
		Thread.sleep(2000);
		WebElement element1 = driver.findElement(By.id("u1929_input"));
		element1.sendKeys("shubhi_cv.pdf");
		Thread.sleep(2000);
		driver.findElement(By.id("u1931")).click();
		Thread.sleep(2000);
		
		WebElement element2 = driver.findElement(By.id("u1964_input"));
		element2.sendKeys("Shubhi");
		Thread.sleep(2000);
		WebElement element3 = driver.findElement(By.id("u1967_input"));
		element3.sendKeys("Sharma");
		Thread.sleep(2000);
		WebElement element4 = driver.findElement(By.id("u1970_input"));
		element4.sendKeys("sharma.shub@husky.neu.edu");
		Thread.sleep(2000);
		WebElement element5 = driver.findElement(By.id("u1973_input"));
		element5.sendKeys("shubhi1104");
		Thread.sleep(2000);
		
		driver.findElement(By.id("u1974")).click();
		Thread.sleep(2000);
		screenShotPath = System.getProperty("user.dir") + "/Screenshots/SignUp.png";
   	 	takeScreenShot(driver, screenShotPath);
	 	
	    
	}
		catch(Exception e) {
			   e.printStackTrace();	
		}	
		
		
	}

@Test                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
public void hello1() throws InterruptedException {
	
	try {
		
		//login and homepage search flow.
		driver.get("file:///C:/Users/shubhi/Documents/Axure/Testing1/login.html");
		WebElement element = driver.findElement(By.id("u1888_input"));
		element.sendKeys("sharma.shub@husky.neu.edu");
		Thread.sleep(2000);
		WebElement element1 = driver.findElement(By.id("u1889_input"));
		element1.sendKeys("shubhi1104");
		Thread.sleep(2000);
		driver.findElement(By.id("u1890")).click();
		Thread.sleep(2000);
		
		WebElement element2 = driver.findElement(By.id("u12_input"));
		element2.sendKeys("Software Developer");
		Thread.sleep(2000);
		WebElement element3 = driver.findElement(By.id("u13_input"));
		element3.sendKeys("France");
		Thread.sleep(2000);
		WebElement element4 = driver.findElement(By.id("u14_input"));
		element4.sendKeys("Atos");
		Thread.sleep(2000);
		driver.findElement(By.id("u15_img")).click();
		Thread.sleep(2000);
		
		screenShotPath = System.getProperty("user.dir") + "/Screenshots/Loginsucess.png";
   	 	takeScreenShot(driver, screenShotPath);
	    
	    
	}
		catch(Exception e) {
			   e.printStackTrace();	
		}	
		
		
	}



 
  @Test
  public void hello2() throws InterruptedException {    
   try {
    
	 //Online learning and webinar1 flow.
	 		driver.get("C:/Users/shubhi/Documents/Axure/Testing1/onlinelearning.html");
	 		Thread.sleep(2000);
	 		driver.findElement(By.id("u1219")).click();
	        Thread.sleep(2000);
	 		driver.findElement(By.id("u1560_img")).click();
	 		Thread.sleep(2000);
	 		driver.findElement(By.id("u1625")).click();
	 		Thread.sleep(2000);
	 		
	 		WebElement element = driver.findElement(By.id("u1834_input"));
		    element.sendKeys("Shubhi Sharma");
		    Thread.sleep(2000);
		    WebElement element1 = driver.findElement(By.id("u1835_input"));
		    element1.sendKeys("sharma.shub@husky.neu.edu");
		    Thread.sleep(2000);
		    WebElement element2 = driver.findElement(By.id("u1836_input"));
		    element2.sendKeys("9174356505");
		    Thread.sleep(2000);
		    driver.findElement(By.id("u1837")).click();
		    Thread.sleep(2000);
		 	driver.findElement(By.id("u1626")).click();
		 	Thread.sleep(5000);
		 	
		 	screenShotPath = System.getProperty("user.dir") + "/Screenshots/WebinarSuccess.png";
	   	 	takeScreenShot(driver, screenShotPath);
		 	
		
	 	   
		     
		    }
   catch(Exception e) {
	   e.printStackTrace();
   }
 }
  
 @Test
 public void hello3() throws InterruptedException {    
	   try {
		   //Resume writing flow.
		   driver.get("file:///C:/Users/shubhi/Documents/Axure/Testing1/resume_coverletter.html");
	 	   Thread.sleep(2000);
	 	   driver.findElement(By.id("u459")).click();
	       Thread.sleep(2000);
	       driver.findElement(By.id("u540")).click();
	       Thread.sleep(2000);
	       WebElement element = driver.findElement(By.id("u583_input"));
		   element.sendKeys("shubhi_cv.pdf");
		   Thread.sleep(2000);
		   WebElement element1 = driver.findElement(By.id("u584_input"));
		   element1.sendKeys("sharma.shub@husky.neu.edu");
		   Thread.sleep(2000);
		   driver.findElement(By.id("u585")).click();
		   Thread.sleep(2000);
		   driver.findElement(By.id("u635")).click();
		   Thread.sleep(5000);
		   
		   screenShotPath = System.getProperty("user.dir") + "/Screenshots/Resume.png";
	   	 	takeScreenShot(driver, screenShotPath);
	   }
	   catch(Exception e) {
		   e.printStackTrace();
	   }
	 }
	   
@Test
public void hello4() throws InterruptedException {    
	   try {
		   //Recruiters flow.
		   driver.get("file:///C:/Users/shubhi/Documents/Axure/Testing1/recruiters.html");
	 	   Thread.sleep(2000);
	 	   driver.findElement(By.id("u878_img")).click();
	       Thread.sleep(2000);
	       driver.findElement(By.id("u948")).click();
	       Thread.sleep(3000);
	       driver.findElement(By.id("u1013")).click();
	       Thread.sleep(2000);
	       driver.findElement(By.id("u1023")).click();
	       Thread.sleep(2000);
	       screenShotPath = System.getProperty("user.dir") + "/Screenshots/recruiters.png";
	   	 	takeScreenShot(driver, screenShotPath);
 
	   }
	   catch(Exception e) {
		   e.printStackTrace();
	   }
	 }
 
  @After
  public void closeBrowser() throws InterruptedException {
	  /*reports.endTest(test);
	  reports.flush();
	  Thread.sleep(2000);*/
	  driver.quit();
  }
  
  public void takeScreenShot(WebDriver driver, String filePath) {
      File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
      try {
          FileUtils.copyFile(scrFile, new File(filePath));
      } catch (IOException e) {
          e.printStackTrace();
      }
  }
}