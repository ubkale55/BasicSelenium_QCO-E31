package Practice_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsEx1_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 
		  WebDriver driver = new ChromeDriver();  
	     driver.get("https://www.amazon.in/");
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.name("field-keywords")).sendKeys("Puma");
	}

}
