package Mock_Practice_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class h_Traversing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.name("q")).sendKeys("iphone");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
//		String price = driver.findElement(By.xpath("//div[text()='Apple iPhone 16 (White, 128 GB)']/../..//div[@class='Nx9bqj _4b5DiR']")).getText();
		
//		System.out.println(price);
	
		
		WebElement price = driver.findElement(By.xpath("//div[text()='Apple iPhone 16 (White, 128 GB)']/ancestor::div[@class='yKfJKb row']/descendant::div[@class='Nx9bqj _4b5DiR']"));
	     String printPrice = price.getText();
	     System.out.println(printPrice);
	     
	     

	}

}
