package Practice_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class RelativeXpathEx {
   
	public static void main(String[] args) {
		
    	// Basic Relative Types of Xpath :- Supports all the attributes, Attribute Name, Attribute Value, html Tag, visible Text
		//& all the Types of Visible text
		
		// Types:-
		//xpath by Attribute
		// xpath by visibleText
		// xpath by conatins Attribute
		// xpath by contains visibleText
		
		// Symbols : -  // ----> Traversing the entire html document or traversing from parent to any child
		// [] ----> Attribute Symbol
		// @ ----> Attribute Symbol (supports only attribute value)
		// text() ----> visibleText (supports only visible text)
		// contains() ----> Removes space, Special Characters, Numbers from the Path
		
		
		// Syntax 1 :- Xpath by Attribute           AttributeName="Atribute"
		
		// ----->>>  //htmltag[@AttributeName='AttributeValue']
		
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		
	//	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Bluetooth");
	//	driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		// Syntax 2 :- xpath by visibleText   >visibleText<
		//------>  //htmltag[text()='AttributeValue']
		
	//	driver.findElement(By.xpath("//a[text()='New Releases']")).click();
		
	//	driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
		
	//	driver.findElement(By.xpath("//a[text()='MX Player']")).click();
		
		
		
		//Syntax 3 :- xpath contains attribute  ---->>> removes space, special character, numbers from the path
		// ---->>>  //htmltag[contains(@AttributeName,'AttributeValue')]
		
	//	driver.findElement(By.xpath("//input[contains(@aria-label,'Search Amazon.in')]")).sendKeys("Puma");
	//	driver.findElement(By.xpath("//input[contains(@id,'button')]")).click();
		
		
		
		//syntax 4 :- xpath contains visibleText()
        // ----->>>>   //htmltag[contains(text(),'visibleText')]
		
		driver.findElement(By.xpath("//a[contains(text(),'MX')]")).click();
		
		
		
		
	
		
    	
	}
}
