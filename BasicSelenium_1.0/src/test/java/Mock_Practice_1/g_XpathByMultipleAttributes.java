package Mock_Practice_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class g_XpathByMultipleAttributes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		
//		driver.findElement(By.xpath("//input[@type='text' and @name='q']")).sendKeys("Puma");
//		driver.findElement(By.xpath("//button[@type='submit' or @title='Search for Products, Brands and More']")).click();
	
		driver.findElement(By.xpath("//a[@href='/viewcart?marketplace=FLIPKART' or text='Cart']")).click();
		  
	}

}
