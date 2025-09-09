package Mock_Practice_1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://doodles.google/");
		
		TakesScreenshot TS = (TakesScreenshot)driver;
	  
		File temp = TS.getScreenshotAs(OutputType.FILE);
		
		File permLoc = new File("./ScreenShot2/Homepage.png");
		
		FileHandler.copy(temp, permLoc);
		

	}

}
