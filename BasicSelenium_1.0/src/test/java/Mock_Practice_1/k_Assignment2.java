package Mock_Practice_1;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class k_Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("puma");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		List<WebElement> allNames = driver.findElements(By.xpath("//a[@class='WKTcLC']"));
		
		List<WebElement> discounts = driver.findElements(By.xpath("//div[@class='UkUFwK']"));
		
		for (int i = 0; i < allNames.size(); i++) {
			
			System.out.println(allNames.get(i).getText()+"----------->"+discounts.get(i).getText());
			
		}

	}

}
