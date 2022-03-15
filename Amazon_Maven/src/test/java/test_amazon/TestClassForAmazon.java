package test_amazon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom_amazon.Account;
import pom_amazon.HeaderPageApplication;
import pom_amazon.Mobile;

public class TestClassForAmazon {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.amazon.in");
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			HeaderPageApplication headerPageApplication = new HeaderPageApplication(driver);
			
			headerPageApplication.clickOnBestSellers();
			
			headerPageApplication.clickOnWallet();
			
			headerPageApplication.clickOnAddToCart();
			
			Mobile n=new Mobile(driver);
			n.mobilemain();
			
			Account k = new Account(driver);
			k.mainaccount();
			
			
	}
	
	
	
}
