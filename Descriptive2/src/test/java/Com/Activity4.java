package Com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.Test;



public class Activity4 {

	public WebDriver driver;
	 @Test
	  public void FirefoxTest() { 
	     final String URL1 = "http://www.amazon.com";

	//Initializing the firefox driver (Gecko)
	     System.setProperty("webdriver.gecko.driver","C:\\Users\\training\\eclipse-workspace\\Descriptive2\\src\\main\\resources\\geckodriver.exe");
	   driver = new FirefoxDriver();   
	   driver.get("https://www.google.com"); 
	   driver.get(URL1);
	   driver.quit();
	  }
	        @Test
	 public void ChromeTest()
	 { 
	             final String URL2 = "http://www.Facebook.com";
	   //Initialize the chrome driver
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\training\\eclipse-workspace\\Descriptive2\\src\\main\\resources\\chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.get("https://www.google.com"); 
	   driver.get(URL2);
	   driver.quit();
	 }
	
	
	
}
