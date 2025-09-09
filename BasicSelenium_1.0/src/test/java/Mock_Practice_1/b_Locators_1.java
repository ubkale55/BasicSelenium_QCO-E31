package Mock_Practice_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class b_Locators_1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
//		driver.get("https://www.facebook.com/");
//		
//		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
//		driver.findElement(By.name("pass")).sendKeys("Apple");
		
		
		driver.get("https://www.flipkart.com/");
//		driver.findElement(By.name("q")).sendKeys("Puma");
//		driver.findElement(By.className("Pke_EE")).sendKeys("Puma");
		
//		driver.findElement(By.linkText("Mobiles & Tablets")).click();
		
//		driver.findElement(By.partialLinkText("Flight Bookings")).click();
		driver.findElement(By.partialLinkText("Flight")).click();
		
		
		
		
		
		
//		driver.close();
//		driver.quit();

	}

}
