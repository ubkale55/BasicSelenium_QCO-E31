package Practice_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSwitchTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts"); 
		
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click(); 
		
		driver.switchTo().alert().accept();
		
		
	}

}
