package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.github.dockerjava.api.model.Driver;

public class FlipKartPage {

     
	// Initialization
	
	public FlipKartPage(WebDriver driver) 
	{
		
	}
	
	// Element Declaration
	
	@FindAll({@FindBy(name="q"),@FindBy(css = input[title='Search for Products, Brands and More']))}
	
	
	
	
           	   
}
