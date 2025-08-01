package AdvanceScenarios_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
 		
		
		
//		driver.get("https://shoppersstack.com/");
		
	
		//driver.findElement(By.name("loginBtn")).click();  (Not Good Practice....Alwyas Use Variable...hence can be used later)
		
//		WebElement loginBtn = driver.findElement(By.name("loginBtn"));
//		loginBtn.click();
		
		
		// Ex2
		driver.get("https://shoppersstack.com/products_page/82");
		WebElement check = driver.findElement(By.id("Check Delivery"));
	    check.sendKeys("431122");
	    
//		driver.findElement(By.name("Check")).click();  // Error org.openqa.selenium.ElementClickInterceptedException 
//                              // (You need to use Explicit wait i.e Intelleegent Wait)
		
		
		WebElement checkBtn = driver.findElement(By.name("Check"));
		
		// Explicit wait ----> Intelligent wait
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(checkBtn));
		
		checkBtn.click();
		
		
		
	}

}
