package Practice_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByTraversingEx2 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.prokabaddi.com/standings");
		driver.manage().window().maximize();
		
		
//		String matchesWon = driver.findElement(By.xpath("//p[text()='Haryana Steelers']/../../../..//div[@class='table-data matches-won']")).getText();
 //               System.out.println("Total No of Matches Won----->>" +matchesWon );

  //      String matchesLost = driver.findElement(By.xpath("//p[text()='Haryana Steelers']/../../../..//div[@class='table-data matches-lost']")).getText();
  //      System.out.println("Total No of Matches Lost----->>" +matchesLost );
        
        
		String won = driver.findElement(By.xpath("//p[text()='Haryana Steelers']/ancestor::div[@class='row-head']/descendant::div[@class='table-data matches-won']")).getText();
        
	//	String won = driver.findElement(By.xpath("//p[text()='Haryana Steelers']/ancestor::div[@class='row-head']//div[@class='table-data matches-won']")).getText();
      
		System.out.println("Total No of Matches Won ---->>>" + won );
        
	}

}
