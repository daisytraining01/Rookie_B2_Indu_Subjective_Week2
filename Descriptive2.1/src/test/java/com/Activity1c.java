package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;



public class Activity1c {

	 public static void main(String[] args) throws IOException {
	      System.setProperty("webdriver.chrome.driver","C:\\Users\\training\\eclipse-workspace\\Descriptive2.1\\src\\main\\resources\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      String url = "https://www.amazon.in/";
	      driver.get(url);
	      driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
	      // capture screenshot and store the image
	      File s = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	      FileUtils.copyFile(s, new File("D:\\sel\\amazon.png"));
	      driver.quit();
	   }	
	
	
}
