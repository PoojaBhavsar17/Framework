package com.qa.pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class LoginPage extends TestBase {

	//WebDriver driver; 
	By SearchButton= By.className("gNO89b");
	By TextBox =By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input");
	
	
	public LoginPage(WebDriver driver)
	{
		 this.driver=driver;
	}
	
	public String validateTitle()
	{
		System.out.println("ooooooooooooo"+driver.getTitle());
		return driver.getTitle();
	}
	
	public void EnterText(String text) throws InterruptedException
	{
		Thread.sleep(1000);
		System.out.println(driver.findElement(SearchButton).isDisplayed());
		driver.findElement(TextBox).sendKeys(text);
	}
}
