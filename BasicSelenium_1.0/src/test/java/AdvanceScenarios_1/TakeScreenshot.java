package AdvanceScenarios_1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
         WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

         // TakeScreenShot -----> WebPage
         
//       //  driver.get("https://doodles.google/");
//           driver.get("https://www.flipkart.com/");
//         
//         //Step1 = Type Casting
//         
//         TakesScreenshot TS = (TakesScreenshot)driver;
//         
//         // step 2 : take Screenshot using  referance variable
//         
//         File temp = TS.getScreenshotAs(OutputType.FILE);
//         
//         // step 3 : Permanent location
//         
//         File permLoc = new File("./screenshot/HomePage.png");
//          
//         // step 4 : Copy from temp to permananent 
//		
//		  FileHandler.copy(temp, permLoc);
		  
	
                //  ScreenShot -------> WebElement
            
         
         driver.get("https://demowebshop.tricentis.com/");
         
         WebElement logo = driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']"));
         
         File temp = logo.getScreenshotAs(OutputType.FILE);
         
         File permLoc2 = new File("./screenshot/logo.png");
         
        FileHandler.copy(temp, permLoc2);
         
         
         
		  
		  
		  
		//  driver.quit();
		

	}

}
