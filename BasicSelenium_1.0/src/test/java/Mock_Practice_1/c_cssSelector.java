package Mock_Practice_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c_cssSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/v1/");
		
		
//		driver.findElement(By.cssSelector("[type='text']")).sendKeys("standard_user");
//		driver.findElement(By.cssSelector("input[data-test='username']")).sendKeys("standard_user");
//		driver.findElement(By.cssSelector("input[id='user-name']")).sendKeys("standard_user");
		
//		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("secret_sauce");
		
		
		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		
		driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
		
		
//		driver.findElement(By.cssSelector(".btn_action")).click();
		
		driver.findElement(By.cssSelector("input.btn_action")).click();
		
		
		
		
		

	}

}
