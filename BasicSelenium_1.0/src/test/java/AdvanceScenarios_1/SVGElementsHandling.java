package AdvanceScenarios_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVGElementsHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.highcharts.com/");
		
		driver.findElement(By.xpath("//*[name()='svg' and @id='logo-highcharts']")).click();
		
	//	or
		
		WebElement svg = driver.findElement(By.xpath("//*[name()='svg' and @id='logo-highcharts']"));
		
		svg.click();
		

     // Here PopUp is getting so we have to handle the popup before svg
	}

}
