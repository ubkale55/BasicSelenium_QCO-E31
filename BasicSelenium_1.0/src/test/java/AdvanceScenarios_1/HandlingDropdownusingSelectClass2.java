package AdvanceScenarios_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdownusingSelectClass2 {

	public static void main(String[] args) {
		

		WebDriver driver = new ChromeDriver();
	      
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Create new account")).click();
		
		WebElement dateList = driver.findElement(By.id("day"));
		Select select = new Select(dateList);
		
		WebElement monthlist = driver.findElement(By.id("month"));
		Select select2 = new Select(monthlist);
		
		WebElement yearlist = driver.findElement(By.id("year"));
		Select select3 = new Select(yearlist);
		
		
		
	}

}
