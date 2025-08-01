package Practice_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 WebDriver driver = new ChromeDriver();
		 
	// Flipkart Application
		 
	//	 driver.get("https://www.flipkart.com");
	//	 driver.manage().window().maximize();
		 
		 
	//	 driver.findElement(By.linkText("Mobiles")).click();
		 
	
	//-------------------------------------------
		
	//Amazon Application
		 
		 
		 driver.get("https://www.amazon.in");
		 driver.manage().window().maximize();
		 	 
		 
	//	 driver.findElement(By.linkText("MX Player")).click();
	//   driver.findElement(By.linkText("Today's Deals")).click();
	//	driver.findElement(By.partialLinkText("Today's ")).click();
	//	driver.findElement(By.partialLinkText("Today's Deals")).click(); 
		
		
		
	}

}
