package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseClass;
import pom.ApplicationHeaderPage;
import pom.LoginPage;
import pom.ReportClass;
import pom.TaskClass;
import pom.UserClass;

public class Acti_TestNG_New extends BaseClass {
	private WebDriver driver;
    	@BeforeClass
		public void TestActi() throws InterruptedException {
//			System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
			driver = new ChromeDriver();
//			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//			driver.get("http://localhost/login.do");
			LoginPage a=new LoginPage(driver);
			a.mainlogin();	
		}
		@BeforeMethod
		public void pkg() throws InterruptedException {	
			System.out.println("learn how to automate");
	
			
		}
		@Test  
		public void application() throws InterruptedException {
			ApplicationHeaderPage b = new ApplicationHeaderPage(driver);
			b.mainapplication();		
		}
		@Test
		public void task() throws InterruptedException {
			TaskClass t=new TaskClass(driver);
			t.maintask();
		}
		@Test
		public void report() {
			ReportClass r=new ReportClass(driver);
			r.mainreport();		
		}	
		@Test
		public void user() throws InterruptedException {
			UserClass u=new UserClass(driver);
			u.usermethod();
		}
		@AfterMethod
		public void close() {
			System.out.println("after every method after method run");
			
		}
		@AfterClass
		public void after() {
			driver.close();
		}

	

}
