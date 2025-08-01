package AdvanceScenarios_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.awt.*;

public class HandlingDropUsingRobotClass {

	public static void main(String[] args) throws Throwable {
		
//		not recommended....
		
		WebDriver driver = new ChromeDriver();
	      
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Create new account")).click();
		
		WebElement datelist = driver.findElement(By.id("day"));
		datelist.click();
		
		Robot rob = new Robot();
//		rob.keyPress
		
		

	}

}
