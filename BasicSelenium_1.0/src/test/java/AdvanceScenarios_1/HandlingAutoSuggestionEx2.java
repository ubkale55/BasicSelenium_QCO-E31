package AdvanceScenarios_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAutoSuggestionEx2 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
 
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("(//input[@placeholder='Search for Products...'])[2]")).sendKeys("Mangoes");
	
		Thread.sleep(2000);
		
	   List<WebElement> allMangoes = driver.findElements(By.xpath("//span[@class='Label-sc-15v1nk5-0 QuickSearch___StyledLabel2-sc-rtz2vl-7 gJxZPQ gFDEBU']"));
		
	   int count =0;
	   
	   for (WebElement mango : allMangoes)
	   {
		
		   System.out.println(mango.getText());
		
		count++;
		
		
		if( mango.getText().contains("Kesar Mango"))
		{
			mango.click();
		}
		
	   }
	   
	   System.out.println("Total Auto Suggestion Elements ---->"+count);
	   
	   
	   
		
	   
	   //span[@class='Label-sc-15v1nk5-0 QuickSearch___StyledLabel2-sc-rtz2vl-7 gJxZPQ gFDEBU']
		
		
		
		
		
	   }

}
