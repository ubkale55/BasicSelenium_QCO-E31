package Practice_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethods {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		
		  WebDriver driver = new ChromeDriver();
		  
		 // driver.navigate().to("https://www.flipkart.com");
		  
		  driver.get("https://www.flipkart.com");
		  
		  Thread.sleep(3000);
		  driver.navigate().back();
		  
		  
		  
		  
	}

}
