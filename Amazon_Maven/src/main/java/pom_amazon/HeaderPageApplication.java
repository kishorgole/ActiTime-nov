package pom_amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderPageApplication {
	private WebDriver driver;
	
	@FindBy (xpath = "(//a[text()='Best Sellers'])[1]")
	private WebElement bestSellers;
	
	@FindBy (xpath = "(//div[@class='zg-carousel-general-faceout']//img)[2]")
	private WebElement wallet;
	
	@FindBy  (xpath = "//input[@id='add-to-cart-button']")
	private WebElement addToCart;
	
	public  HeaderPageApplication(WebDriver driver) {		
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	public void clickOnBestSellers() {
		bestSellers.click();		
	}
	public void clickOnWallet() {
		wallet.click();
	}
	public void clickOnAddToCart() {
		addToCart.click();
	}
	
}

