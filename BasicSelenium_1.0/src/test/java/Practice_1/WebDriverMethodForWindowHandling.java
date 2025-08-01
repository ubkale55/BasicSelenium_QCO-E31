package Practice_1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethodForWindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		
	     	driver.findElement(By.name("q")).sendKeys("iphone");
	     		
			driver.findElement(By.cssSelector("[type=\"submit\"]")).click();
			
			
            String win = driver.getWindowHandle();
            System.out.println(win);
            
            
            driver.findElement(By.xpath("(//div[@class=\"KzDlHZ\"])[1]")).click();

    		//getWindowHandles()---->Fetches all the windows ids opened in the Application
    		Set<String> allWin = driver.getWindowHandles();
    		System.out.println(allWin);
            
        //    driver.close();
    		
    		
    		
    		
            
          


	}

}
