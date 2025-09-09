package Mock_Practice_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class e_AbsoluteXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("html/body/div[2]/div/div/div/form/input")).sendKeys("standard_user");
		
		driver.findElement(By.xpath("html/body/div[2]/div/div/div/form/input[2]")).sendKeys("secret_sauce");
		
		
		driver.findElement(By.xpath("html/body/div[2]/div/div/div/form/input[3]")).click();
		
		
		
		
	}

}
