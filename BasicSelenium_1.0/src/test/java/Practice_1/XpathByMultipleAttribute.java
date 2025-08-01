package Practice_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class XpathByMultipleAttribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//  AND               OR
		//  F F  =F        F F =F
		//  F T  =F        F T =T
		//  T F  =F        T F =T
		//  T T  =T        T T =T
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		

		//Syntax1 :-  //htmltag[@AttributeName='AttributeValue' and @AttributeName='AttributeValue')]
		
	//	driver.findElement(By.xpath("//input[@type='text' and @name='field-keywords']")).sendKeys("Puma");
		
		//Syntax2 :-  //htmltag[@AttributeName='AttributeValue' or @AttributeName='AttributeValue')]
		
		
		
		// Syntax3: //htmltag[text() = 'visibleText' and @AttributeName= 'AttributeValue']
		
		
		
		
		
		
		
		
		
		
		
	}

}
