package pom_amazon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mobile {
	private WebDriver driver;
	
	@FindBy (xpath = "//a[@href='/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles']")
	private WebElement mobile;
	
	@FindBy (xpath = "(//span[@class='nav-a-content'])[5]")
	private WebElement audio;
	
	@FindBy (xpath = "//a[text()='Saregama']")
	private WebElement saragame;
	
	@FindBy (xpath = "(//div[@id='s-refinements']//div//ul)[6]")
	private WebElement eligibal;
	
	public Mobile(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	public void mobilemain() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		mobile.click();
		//audio.click();
		Actions s =new Actions(driver);
		s.moveToElement(audio).click().build().perform();
	//	s.moveToElement(saragame).click().build().perform();
	//	saragame.click();
	//	eligibal.click();
	}
	
}
