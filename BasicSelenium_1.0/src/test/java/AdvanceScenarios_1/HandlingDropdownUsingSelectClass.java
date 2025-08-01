package AdvanceScenarios_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdownUsingSelectClass {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
	      
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Create new account")).click();
		
//    Select By Index---------> index value strts from 0
		
		WebElement dateList = driver.findElement(By.id("day"));
		Select select = new Select(dateList);
//		 Select By Index---------> index value strts from 0
//		select.selectByIndex(24);
//          select.selectByValue("25");
//	      select.selectByVisibleText("25");
	      
	      
	      
		WebElement monthlist = driver.findElement(By.id("month"));
		Select select2 = new Select(monthlist);
//		select2.selectByIndex(0);
//		select2.selectByValue("1");
//		select2.selectByVisibleText("Jan");
		
		
		WebElement yearlist = driver.findElement(By.id("year"));
		Select select3 = new Select(yearlist);
//		select3.selectByIndex(29);
//		select3.selectByValue("1996");
//		select3.selectByVisibleText("1996");
		
		
//		 -------------------------------------
		
		List<WebElement> allOpt = select.getOptions();
		
		for (WebElement opt : allOpt)
		{
		System.out.println(opt.getText());	
		}

		List<WebElement> allOpt2 = select2.getOptions();
		
		for (WebElement opt2 : allOpt2)
		{
		System.out.println(opt2.getText());	
		}
		
		List<WebElement> allOpt3 = select3.getOptions();
		
		
		
		
		
	}

}
