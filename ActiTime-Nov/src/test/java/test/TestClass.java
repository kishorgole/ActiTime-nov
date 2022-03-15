package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.ApplicationHeaderPage;
import pom.LoginPage;
import pom.ReportClass;
import pom.TaskClass;
import pom.UserClass;

public class TestClass  {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://localhost/login.do");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		LoginPage loginpage = new LoginPage(driver);
		 loginpage.mainlogin();
		 
		 ApplicationHeaderPage ap = new ApplicationHeaderPage(driver);
		 ap.mainapplication();
   
	    TaskClass t=new TaskClass (driver);
		t.maintask();
	
	    ReportClass r=new ReportClass(driver);		
		r.mainreport();
		
		UserClass us=new UserClass(driver);
	    us.usermethod();
		
}
}
