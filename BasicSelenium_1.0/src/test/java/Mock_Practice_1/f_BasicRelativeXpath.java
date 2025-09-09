package Mock_Practice_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class f_BasicRelativeXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		
//		driver.findElement(By.xpath("//input[@aria-label='Search Amazon.in']")).sendKeys("Puma");
//		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.findElement(By.xpath("//input[contains(@aria-label,'Search')]")).sendKeys("Puma");
		driver.findElement(By.xpath("//input[contains(@id,'nav')]")).click();
		
//		driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
		
//		driver.findElement(By.xpath("//a[text()='MX Player']")).click();
		
//		driver.findElement(By.xpath("//a[contains(text(),'MX')]")).click();
		
		
		
		
		
		

	}

}
