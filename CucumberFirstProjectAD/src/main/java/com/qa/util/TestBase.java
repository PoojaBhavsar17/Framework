package com.qa.util;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.pages.LoginPage;

public class TestBase {

	public static WebDriver driver; 
	public static Properties prop; 
	public static  LoginPage lp;
	public TestBase()
	{
		try
		{
			prop=new Properties();
			FileInputStream fis= new FileInputStream("C:\\Users\\91975\\eclipse-workspace\\CucumberFirstProjectAD\\src\\main\\java\\com\\qa\\config\\config.properties");
	prop.load(fis);
	
			System.out.println(fis.read()+"in constructor"+prop.elements()+prop.getProperty("url"));
		}
		catch(Exception e)
		{
			e.getMessage();
		}
	}
	
	public static void initialization()
	{
		String browsername=prop.getProperty("browser");
		if (browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\91975\\Desktop\\Pooja Bhavsar\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		
		 lp=new LoginPage(driver);
	}
	
}
