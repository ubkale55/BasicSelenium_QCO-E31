package AdvanceScenarios_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpsHandling_Authentication {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		// Authentication
		
//		// UN--> admin, PWD---> admin for this website
//		// https://USENAME:PASSWORD@Something.com
//		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
//		
		
		
	// Hidden PopUps
		
		
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(2000);
		
		WebElement clsBtn = driver.findElement(By.xpath("//span[@class='commonModal__close']"));
		clsBtn.click();
		
		Thread.sleep(2000);
		WebElement DateDrop = driver.findElement(By.xpath("//span[text()='Departure']"));
		DateDrop.click();
		
		Thread.sleep(2000);
		WebElement date = driver.findElement(By.xpath("//div[@aria-label='Tue Aug 05 2025']"));
		date.click();
		
		
		
		
		

	}

}
