package basepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class BaseClassOfAmazon {
	
	public static WebDriver chromeBrowser() {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		return driver;
	}
	public static WebDriver firefoxBrowser() {
		System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in");
		return driver;
	}
	public static WebDriver IEBrowser() {
		System.setProperty("webdriver.opera.driver", "E:\\operadriver_win64\\operadriver_win64\\operadriver.exe");
		WebDriver driver=new OperaDriver();
		driver.get("https://www.amazon.in");
		return driver;
	}
}
