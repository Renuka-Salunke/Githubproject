package com.facebook.pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageObject {

	WebDriver driver;
	
	
	public void openURL()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	      
	    driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       
        driver.get("https://www.facebook.com/");
	}
	
	public void enterusername()
	{
		driver.findElement(By.xpath("")).sendKeys("abc@gmail.com");
	}
	
	
	public void enterpassword()
	{
		driver.findElement(By.xpath("")).sendKeys("12345");
	}
	
	public void clickloginbutton()
	{
		driver.findElement(By.xpath("")).click();
	}
	}

