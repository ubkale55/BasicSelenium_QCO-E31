package Practice_1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
//
	//	WebDriver driver = new ChromeDriver();
		
		
	 //  	driver.get("https://www.flipkart.com");
		
	//	String title = driver.getTitle();
	//	System.out.println(title);
		  
	//	String url = driver.getCurrentUrl();
	//	System.out.println(url);
		   
	 //   String PAGE = driver.getPageSource();
	//	System.out.println(PAGE);
		
		
	 //    Options opt = driver.manage();
	//     Window win = opt.window();
	 //    win.maximize();
	    
	 //   driver.manage().window().maximize();
	    
	  //  driver.manage().window().minimize();
	    
	 //   driver.manage().window().fullscreen();
	    
	    
	  //   Dimension size = driver.manage().window().getSize();
	     
	//     System.out.println(size.getHeight());
	 //    System.out.println(size.getWidth());
	     
	    
	  //  Dimension dimension = new Dimension(600,350) ;
	 //   driver.manage().window().setSize(dimension);
	
	    
	//  Point position = driver.manage().window().getPosition();
	// System.out.println(position.getX());
   //  	System.out.println(position.getY());
	
	
	   Thread.sleep(3000);
	   
	   Point point = new Point(300,550);
	   driver.manage().window().setPosition(point);
	
	    
	    
	    
	    
	    
			
		}
	    		
	     		
	}


