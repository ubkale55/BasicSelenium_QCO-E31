package AdvanceScenarios_1;

import java.security.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingKeyboardStrokes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		
//	 
//		Case 1:-
		
//		driver.findElement(By.name("user-name")).sendKeys("standard_user");
//		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		
//		WebElement passWord = driver.findElement(By.name("password"));
//		passWord.sendKeys("secret_sauce");
//		passWord.sendKeys(Keys.ENTER);
		
		// or
//		passWord.sendKeys("secret_sauce",Keys.ENTER);
		
		//or
		
		// Case 2 :-
//		driver.findElement(By.name("user-name")).sendKeys("standard_user");
//		driver.findElement(By.name("password")).sendKeys("secret_sauce",Keys.ENTER);

		// case3:-
		
//		WebElement userName = driver.findElement(By.name("user-name"));
//		userName.sendKeys("standard_user");
//		userName.sendKeys(Keys.TAB,"secret_sauce",Keys.ENTER);
		

		// Case 4:- Code Optimization
		
//		driver.findElement(By.name("user-name")).sendKeys("standard_user",Keys.TAB,"secret_sauce",Keys.ENTER);
		
       	//	Scenario1 : Control Keys
		
//check		driver.findElement(By.name("user-name")).sendKeys("Utkarsh",Keys.CONTROL+"a",Keys.CONTROL+"c",Keys.TAB,Keys.CONTROL+"v");
		
		
//		 WebElement userName = driver.findElement(By.name("user-name"));
//		 userName.sendKeys("QSpiders",Keys.CONTROL+"a");
//		 userName.sendKeys(Keys.CONTROL+"c");
//		 userName.sendKeys(Keys.TAB,Keys.CONTROL+"v");
//		 
		
		// Optimise
		
// not working		driver.findElement(By.name("user-name")).sendKeys("QSpiders",Keys.CONTROL+"a",Keys.CONTROL+"c",Keys.TAB,Keys.CONTROL+"v");
		
		driver.findElement(By.name("user-name"))
		 
		
		
	}

}
