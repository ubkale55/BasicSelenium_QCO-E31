package AdvanceScenarios_1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingKeyboardStrokesUsingRobotClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.flipkart.com");
		 driver.manage().window().maximize();
		
		 // KeysClass
		 
//		 driver.findElement(By.name("q")).sendKeys("Puma",Keys.ENTER);
		
		 // Robot Class
		 
		 driver.findElement(By.name("q")).sendKeys("Puma");
			
		 Robot rob = new Robot;
		 rob.
	}

}
