package Practice_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.saucedemo.com/v1/");
		 driver.manage().window().maximize();
		 
	// Locator 1:-  id()
	//	 driver.findElement(By.id("user-name")).sendKeys("standard_user");
		 
	//	 driver.findElement(By.id("password")).sendKeys("secret_sauce");
		 
	//	 driver.findElement(By.id("login-button")).click();
			 
	//	
		
	// Locator 2 : name()
		 
	//	 driver.findElement(By.name("user-name")).sendKeys("standard_user");
	//	 driver.findElement(By.name("password")).sendKeys("secret_sauce");
		 
	//	 driver.findElement(By.className("btn_action")).click();
		 
		 
		 
	}

}
