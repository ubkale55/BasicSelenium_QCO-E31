package AdvanceScenarios_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDownbySelect_Multiple2 {

	
	 public static void main(String[] args) throws Throwable {
		
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
		 
		WebElement monthNames = driver.findElement(By.name("Month"));
		
		Select select = new Select(monthNames);
		
		select.selectByIndex(2);
		Thread.sleep(1000);
		select.selectByValue("June");
		Thread.sleep(1000);
		select.selectByVisibleText("November");
		Thread.sleep(1000);
		
		
		
		
	}
}
