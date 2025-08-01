package Practice_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.saucedemo.com/v1/");
		 driver.manage().window().maximize();
		 
		 //cssSelector Syntax1 : [Attributename='AttributeValue']
		 
		// driver.findElement(By.cssSelector("[placeholder='Username']")).sendKeys("standard_user");
		// driver.findElement(By.cssSelector("[type='text']")).sendKeys("standard_user");
		// driver.findElement(By.cssSelector("[autocorrect='off']")).sendKeys("standard_user");
		 
		 //Syntax2 : htmlTag[Attributename='AttributeValue']
		 
		// driver.findElement(By.cssSelector("")).sendKeys("");
		// driver.findElement(By.cssSelector("input[type='password']")).sendKeys("secret_sauce");
		 
		 //Syntax2 : htmlTag[Attributename='AttributeValue']
			// driver.findElement(By.cssSelector("")).sendKeys("");
		 
		 // syntax3 ; #----> supports only id Attribute name
		 //   
		 driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		 
		 //Syntax 4
		 
		 driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
		
		 // Syntax 5
		 
		// driver.findElement(By.cssSelector(".btn_action")).click();
		 
		 
		 // Syntax 6 classname
		 
		 driver.findElement(By.cssSelector("input.btn_action")).click();
		 
		 
	}

}
