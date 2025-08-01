package AdvanceScenarios_1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handling_dropdowns {

	public static void main(String[] args) {
       
//		Not Recommenededsdsdc 
		
		WebDriver driver = new ChromeDriver();
      
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Create new account")).click();
		
		WebElement datelist = driver.findElement(By.id("day"));
		datelist.click();
		datelist.sendKeys(Keys.ARROW_DOWN);
		datelist.sendKeys(Keys.ARROW_DOWN);
		
		WebElement monthlist = driver.findElement(By.id("month"));
		monthlist.click();
		monthlist.sendKeys(Keys.ARROW_UP);
		monthlist.sendKeys(Keys.ARROW_UP);
		monthlist.sendKeys(Keys.ARROW_UP);
		monthlist.sendKeys(Keys.ARROW_UP);
		monthlist.sendKeys(Keys.ARROW_UP);
		
		WebElement yearlist = driver.findElement(By.id("year"));
		yearlist.click();
		yearlist.sendKeys(Keys.ARROW_UP);
		yearlist.sendKeys(Keys.ARROW_UP);
		yearlist.sendKeys(Keys.ARROW_UP);
		
		
	
		
		
	}

}
