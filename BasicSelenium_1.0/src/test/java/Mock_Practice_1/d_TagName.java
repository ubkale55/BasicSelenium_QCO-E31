package Mock_Practice_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class d_TagName {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com");
		
//		List<WebElement> allImgs = driver.findElements(By.tagName("img"));
//		System.out.println(allImgs.size());
		
		List<WebElement> allSvg = driver.findElements(By.tagName("svg"));
		System.out.println(allSvg.size());
		
		
		
	}

}
