package Practice_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.flipkart.com");
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.name("q")).sendKeys("iphone");
		 driver.findElement(By.cssSelector("[type='submit']")).click();
		 
		 List<WebElement> allNames = driver.findElements(By.className("KzDlHZ"));
		 
	     List<WebElement> allPrice = driver.findElements(By.className("Nx9bqj _4b5DiR"));
		 
		 for (WebElement name : allNames)
		 {
		     System.out.println(name.getText());	
		 }
		 
		 
		 
		 

	}

}
