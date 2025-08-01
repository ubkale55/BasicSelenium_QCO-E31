package Practice_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class cssSelectorEx1_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 
		WebDriver driver = new EdgeDriver();
		
	//	driver.get("https://www.flipkart.com");
	//	driver.manage().window().maximize();
		
	//	driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Puma");
	//	driver.findElement(By.cssSelector("[aria-label='Search for Products, Brands and More']")).click();
		
		
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("Puma");
		
	
		
		
	}

}
