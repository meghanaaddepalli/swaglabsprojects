package com.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageM {
	WebDriver driver;
	public void browser() { 
		System.setProperty("webdriver.chrome.driver",  "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
	}

	public void LoginSwag() 
	{
		driver.get("https://www.saucedemo.com/");
		System.out.println(driver.getTitle());
	}
	
	
	public void UserName(String username) throws IOException, InterruptedException 
	{
		Thread.sleep(3000);
	//	loginClick.click();
		
		
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
		
		
	}
	
	public void Password(String password) throws IOException, InterruptedException 
	{
		Thread.sleep(3000);
	//	loginClick.click();
		
		
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		 
	}
	
	public void LoginBtn() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@class='btn_action']")).click();
		Thread.sleep(3000);
//		driver.close(); // close the current tab
	}
	
	public void Logout() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Open Menu')]")).click();
		driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
		driver.close();
	}

}
