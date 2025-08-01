package Practice_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocatorEx1 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		
	//	driver.findElement(By.)

		
		// Relative Locator
		
		//near()
		
//		WebElement searchIcon = driver.findElement(By.xpath("//input[@type='submit']"));
//		
//		driver.findElement(RelativeLocator.with(By.tagName("input")).near(searchIcon)).sendKeys("Book");
		
		
//		WebElement refEle = driver.findElement(By.cssSelector("[value='Search store']"));
//		
//		driver.findElement(RelativeLocator.with(By.tagName("input")).toRightOf(refEle)).click();
		
//		driver.findElement(By.xpath(""));
		
		driver.findElement(By.linkText("Log in")).click();
		
//		WebElement ref = driver.findElement(By.id("Password"));
//		
//		driver.findElement(RelativeLocator.with(By.tagName("input")).above(ref)).sendKeys("abcd@gmail.com");
//		
		
		
		
		
		
		
		
	}

}
