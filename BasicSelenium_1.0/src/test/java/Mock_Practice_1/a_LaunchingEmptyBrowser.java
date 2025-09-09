package Mock_Practice_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class a_LaunchingEmptyBrowser {

	public static void main(String[] args) {
		
		
		// case1:- selenium webDriver:-3.141.59, Browser-Server:- chromeDriver.exe
		
//		 String key = "webdriver.chrome.driver";
//		 String value = "./src/main/resources/chromedriver.exe";
//		 System.setProperty(key, value);
//		 WebDriver driver=new ChromeDriver();
		
		
		// case2:-Selenium webdriver:-3.141.59, webdrivermanager:-6.1.0
		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
		
		
		// case3:- Selenium webdriver:-4.33.0, webdrivermanager:-6.1.0
		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
		
		
		// case4:-Selenium webdriver:-4.33.0
		
		WebDriver driver = new ChromeDriver();
		
		
		
		

	}

}
