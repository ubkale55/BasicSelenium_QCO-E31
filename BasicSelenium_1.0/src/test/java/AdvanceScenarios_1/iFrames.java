package AdvanceScenarios_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		
		// by using Index of Frame (Index Starts from 0)(First frame index 0)
	//	driver.switchTo().frame(0);
		
	// by using name of the frame
	//	driver.switchTo().frame("SingleFrame");
		
		// by using Webelement
		WebElement we = driver.findElement(By.xpath("//iframe[@id='singleframe']")); // You Can use ID Drectly no need of xpath
		driver.switchTo().frame(we);
		
		WebElement input = driver.findElement(By.xpath("//input[@type='text']"));
		input.sendKeys("0000");
		
		driver.switchTo().parentFrame();
	//	driver.switchTo().defaultContent();
		
		WebElement homeBtn = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
		homeBtn.click();
		
		
	
		
		
		
		
	}

}
