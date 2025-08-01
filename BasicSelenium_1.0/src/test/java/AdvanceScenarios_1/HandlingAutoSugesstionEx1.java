package AdvanceScenarios_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v135.input.model.DragData;

import com.github.dockerjava.api.model.Driver;

public class HandlingAutoSugesstionEx1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("Nike");
		
		Thread.sleep(2000);
		List<WebElement> allSugg = driver.findElements(By.xpath("//ul[@class='_1sFryS _2x2Mmc _3ofZy1']//li"));
		
		for (WebElement sugg : allSugg) 
		{
		   System.out.println(sugg.getText());	
		   
		   if(sugg.getText().contains("nike running shoes"));
		 
		   {
			   Thread.sleep(2000);
			   sugg.click();
			   
		   }
		
		
	}

	}
	
	
	
	
}
