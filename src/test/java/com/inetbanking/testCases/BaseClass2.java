package com.inetbanking.testCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass2 {

	public String baseURL="http://demo.guru99.com/v4/";
	public String username="mngr559553";
	public String password="uvaqUrA";
	public static WebDriver driver;
	
	public static Logger logger;
	
	@BeforeClass
	public void setup()
	{
	    System.setProperty("webdriver.chrome.driver","F:\\Automation\\testworkspace\\SeleniumJava\\Drivers\\chromedriver.exe");  
	      
	   	driver = new ChromeDriver();
	   	
	   	logger = Logger.getLogger("ebanking");
	   	PropertyConfigurator.configure("log4j.properties");
	}
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
}
