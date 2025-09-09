package Mock_Practice_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class i_RelativeLocators {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		
	  WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
	  search.sendKeys("books");
	  driver.findElement(RelativeLocator.with(By.cssSelector("[type='submit']")).toRightOf(search)).click();
		


	}

}
