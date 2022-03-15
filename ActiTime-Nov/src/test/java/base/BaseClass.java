package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class BaseClass {           //pojo -plane old java object
	public static WebDriver chromeBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pc\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		return driver;
	}
	public static WebDriver firefox() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\pc\\Downloads\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost/login.do");
		return driver;
	}
	public static WebDriver operaBrowser() {
		System.setProperty("webdriver.opera.driver", "C:\\Users\\pc\\Downloads\\operadriver_win32\\operadriver.exe");
		WebDriver driver = new OperaDriver();
		driver.get("http://localhost/login.do");
		return driver;
	}
}
