package demoacti;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiDemo {
	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://localhost/login.do");
		System.out.println("hi");
		System.out.println("hellow how are u buddy");
		
		
		
	}

}
