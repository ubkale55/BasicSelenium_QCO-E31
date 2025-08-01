package AdvanceScenarios_1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpsHandling_JS_PopUps {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		// Simple Popups
		
//		driver.get("https://demowebshop.tricentis.com/");
//		
//		WebElement searchBtn = driver.findElement(By.xpath("//input[@type='submit']"));
//		searchBtn.click();
//		
//		Alert alertMsg = driver.switchTo().alert();
//		
//		Thread.sleep(3000);
//		alertMsg.accept();
		
		// Confirmation Popups
		
//		driver.get("https://demo.guru99.com/test/delete_customer.php");
//		
//		WebElement customer = driver.findElement(By.name("cusid"));
//		customer.sendKeys("999999");
//		
//		WebElement submitBtn = driver.findElement(By.name("submit"));
//		submitBtn.click();
//		
//		Alert alert = driver.switchTo().alert();
//		Thread.sleep(3000);
//		alert.dismiss();
		
		// Prompt Popups
		
		driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");
		
		WebElement clkBtn = driver.findElement(By.xpath("(//button[text()='Click Me'])[3]"));
		clkBtn.click();
		
		Alert alertMsg = driver.switchTo().alert();
		
		Thread.sleep(3000);
		String txt = alertMsg.getText();
		System.out.println(txt);
//		Thread.sleep(3000);
//		alertMsg.sendKeys(txt);   // This url doesnot accept values
//		Thread.sleep(3000);
		alertMsg.accept();
		
		
		
		
		
		
		
		
//		driver.quit();
		
		

	}

}
