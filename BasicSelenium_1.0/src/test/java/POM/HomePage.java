package POM;

import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;
	
	
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver,this);
		}
	
	@FindBy(linkText = "Register")
	
	
	private WebElement registerButton;
	private WebElement loginButton;
	private WebElement shoppingCart;
	
	public WebElement getRegisterButton() {
		return registerButton;
	}
	public WebElement getLoginButton() {
		return loginButton;
	}
	public WebElement getShoppingCart() {
		return shoppingCart;
	}
	
	
}
