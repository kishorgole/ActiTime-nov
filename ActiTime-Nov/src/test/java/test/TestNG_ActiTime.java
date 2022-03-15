package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pom.ApplicationHeaderPage;
import pom.LoginPage;
import pom.ReportClass;
import pom.TaskClass;
import pom.UserClass;

public class TestNG_ActiTime {
	
	private WebDriver driver;
	private LoginPage a;
	private ApplicationHeaderPage b;
	private TaskClass t;
	private ReportClass r;
	private UserClass u;
	
	@BeforeTest
	@Parameters("browser")

		public void launchBrowser(String browserName) {
			
			if(browserName.equals("chrome")) 
			{
				System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
				driver=new ChromeDriver();            //BaseClass.chromeBrowser();
			
			}
			if(browserName.equals("Firefox"))
			{
				System.setProperty("webdriver.firefox.driver", "F:\\geckodriver-v0.30.0-win64\\geckodriver.exe");
				driver=new FirefoxDriver();
				
			}	
	}

	@BeforeClass
	public void TestActi() throws InterruptedException {	
	//	System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
	//	driver = new ChromeDriver();
	//	driver.get("http://localhost/login.do");
	//	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
		 a=new LoginPage(driver);
		 b = new ApplicationHeaderPage(driver);
		 t= new TaskClass(driver);
		 r=new ReportClass(driver);
		 u=new UserClass(driver);
	//    a.mainlogin();
	 }
	
	@BeforeMethod
		public void pkg() throws InterruptedException  {	
		driver.get("http://localhost/login.do");
		a.mainlogin();
		 System.out.println("test the app");
    }
	@Test  
	public void application() throws InterruptedException {
		//ApplicationHeaderPage b = new ApplicationHeaderPage(driver);
		System.out.println("test application");
		b.mainapplication();		
	}
	@Test
	public void task() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	//	TaskClass t= new TaskClass(driver);
		System.out.println("test the task");
		t.maintask();
	}
	@Test
	public void report() {
	//	ReportClass r=new ReportClass(driver);
		System.out.println("test the report");
		r.mainreport();		
	}	
	@Test
	public void user() throws InterruptedException {
	//	UserClass u=new UserClass(driver);
		System.out.println("test the user");
		u.usermethod();
	}
	@AfterMethod
	public void message() {
		System.out.println("After method type this message");
	}
	@AfterClass
	public void clearPOMObjects() {
		a=null;
		b=null;
		t=null;
		r=null;
		u=null;
	//	driver.close();
	}
	@AfterTest
	public void closeBrowser() {
		driver.quit();
		driver=null;
		System.gc();
	}

}
