package Practice_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebElementMethodEx {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		
//		Action Methods
		
//		WebDriver driver = new ChromeDriver();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

//		driver.get("https://www.flipkart.com");
		
//		Method1,2 ---> senKeys(),click()
		
//		driver.findElement(By.name("q")).sendKeys("Puma")

		
		
		
		
//		------------------------------------------------------------------
//	 Method4 -----> clear()
		
		
//		driver.get("https://saucedemo.com/v1/");
		
//		driver.findElement(.By.id("user-name"))
		
		
//	------------------------------------------------------------------------------------------------------
		
//		Verification Methods or Boolean methods
		
//		driver.get("https://www.facebook.com");
//		
//		WebElement fbLogo = driver.findElement(By.xpath("//img[contains(@class,'fb')]"));
//		
//		if (fbLogo.isDisplayed()) 
//		
//		{
//			System.out.println("Logo is Displayed");
//			
//		}
//		
//		else
//		{
//			System.out.println("Logo is Not Displayed");	
//			
//		}
//		
//		WebElement ele = driver.findElement(By.xpath("//a[text()='Create new account']"));
//		
//		if(ele.isEnabled())
//		
//		{
//			ele.click();
//		}
//		
//		else
//		{
//			System.out.println("Element id Not Enabled");
//			
//		}	
//			
//		Thread.sleep(2000);
//		 
//		WebElement radioButton = driver.findElement(By.xpath("//input[@value='1']"));
//		
//		radioButton.click();
//		
//		if(radioButton.isSelected())
//			
//		{
//			System.out.println("Radio Button is Selected");
//			
//		}
//		
//		else
//		{
//			System.out.println("Radio Button is Not Selected");
//		}
//		
//		
//	------------------------------------------------------------------	
		
		
//		driver.get("https://www.facebook.com");
//		
//		WebElement ele = driver.findElement(By.linkText("मराठी"));
		
//		System.out.println(ele.getLocation().getX());
//		System.out.println(ele.getLocation().getY());
//		
//		System.out.println(ele.getSize().getHeight());
//		System.out.println(ele.getSize().getWidth());
		
/*	System.out.println(ele.getRect().getX());	
	System.out.println(ele.getRect().getY());
	
	System.out.println(ele.getRect().getHeight());
	System.out.println(ele.getRect().getWidth());
		
*/		
		
//--------------------------------------------------------------
		
/*		driver.get("https://www.facebook.com");

		String name = driver.findElement(By.cssSelector("[title='Log in to Facebook']")).getTagName();
		
		System.out.println(name);
		
*/
		
//-------------------------------------------------------------------------
		
//        driver.get("https://www.facebook.com");
//        
//        WebElement ele = driver.findElement(By.cssSelector("[alt='Facebook']"));
//        System.out.println(ele.getAttribute("src"));
//        System.out.println(ele.getAttribute("class"));
//        
//        System.out.println(ele.getDomAttribute("src"));
//        System.out.println(ele.getDomAttribute("class"));
        
        
		
//       driver.get("https://www.flipkart.com");
//		
//		WebElement ele = driver.findElement(By.xpath("//span[.='Grocery']"));
//		
//		System.out.println(ele.getDomProperty("clientWidth"));
//		System.out.println(ele.getDomAttribute("clientHeight"));
//		
//		System.out.println(ele.getCssValue("font-size"));
//		
//		System.out.println(ele.getCssValue("font-family"));
//		
//		System.out.println(ele.getCssValue("color"));
		
	
		driver.get("https://www.amazon.in");
		
//		WebElement ele = driver.findElement(By.name("field-keywords"));
//		System.out.println(ele.getAccessibleName());
//		System.out.println(ele.getAriaRole());
//		
//		WebElement ele1 = driver.findElement(By.cssSelector("[href='/minitv?ref_=nav_avod_desktop_topnav']"));
//		System.out.println(ele1.getAccessibleName());
//		System.out.println(ele1.getAriaRole());
		
		driver.findElement(By.name("field-keywords")).sendKeys("PumaTshirt");
		driver.findElement(By.cssSelector("[type='submit']")).click();
		
		WebElement price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]"));
		System.out.println(price);
		
		
		
	}

}
