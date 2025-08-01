package AdvanceScenarios_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.github.dockerjava.api.model.Driver;

public class scrollACtion {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
           
         WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         
         driver.get("https://demowebshop.tricentis.com/");
         
     // Case 1 : Scroll By Amount
         // Vertical Scroll (0,y)  ----> -ve 
         // Horizontal Scoll (x,0)
         
//         Actions act = new Actions(driver);
//         
//         act.scrollByAmount(0, 300).perform();
//         
//         Thread.sleep(2000);
//         
//         act.scrollByAmount(0,200).perform();
//         
//         Thread.sleep(2000);
//         
//         act.scrollByAmount(0, -250).perform();
         
         
         // case 2 : Scroll by Element
         
         Actions act2 = new Actions(driver);
         
         WebElement link1 = driver.findElement(By.xpath("//a[text()='Simple Computer']"));
         
         act2.scrollToElement(link1).perform();
         
         
       

	}

}
