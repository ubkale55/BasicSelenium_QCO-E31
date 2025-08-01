package AdvanceScenarios_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Popups_FileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.naukri.com/");
		
		WebElement register = driver.findElement(By.xpath("//a[text()='Register']"));
		register.click();
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		
		WebElement experienced = driver.findElement(By.xpath("//p[text()='  I have work experience (excluding internships)']"));
		experienced.click();
		
	//	experienced.sendKeys("C:\\Users\\Care\\Desktop\\New folder\\JOINS-FULL-NOTES (4).pdf");
		
		 
	}

}
