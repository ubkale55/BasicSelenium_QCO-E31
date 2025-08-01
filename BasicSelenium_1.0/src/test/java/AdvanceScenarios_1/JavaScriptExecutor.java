package AdvanceScenarios_1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) throws Throwable {
      
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://doodles.google/");
		
		// javascript Executor : Scroll Operations
		
       // ScrollBy()
		
		// typecasting....upcasting
//		JavascriptExecutor jsc = (JavascriptExecutor)driver;
		
//		Thread.sleep(2000);
		
		// executescript() using jsc i.e ref variable of javascript executor
		
//     	jsc.executeScript("window.scrollBy(0,500)");
//     	
//		Thread.sleep(2000);
//
//     	jsc.executeScript("window.scrollBy(0,1500)");
		
		// ScrollTo(x,y);   .......What is Differnecewc xm cm
			
		
//		jsc.executeScript("window.scrollTo(0,500)");
			
//		Thread.sleep(2000);
//		
//		jsc.executeScript("window.scrollTo(0,1500)");
		
		
		// Document Object
		
//		// Exteme Bottom
//		Thread.sleep(2000);
//		jsc.executeScript("window.scrollTo(0,document.body.scrollHeight)");
//		
//		// Extreme Top
//		Thread.sleep(2000);
//		jsc.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
		
		
		// Argument Object?? or Argument only check
		// first find webelement
		WebElement btn = driver.findElement(By.linkText("See all results"));
		
		JavascriptExecutor jsc = (JavascriptExecutor)driver;
		
		Thread.sleep(2000);
		
		jsc.executeScript("argument[0].scrollIntoView(true)",btn);
		
		
		
		
		
		
		
		
		
		
		
	}

}
