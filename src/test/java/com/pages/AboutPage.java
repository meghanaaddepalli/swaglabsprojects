package com.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AboutPage {
	WebDriver driver;
	public void Browsr() { 
		System.setProperty("webdriver.chrome.driver",  "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public void Login() 
	{
		driver.get("https://www.saucedemo.com/");
		System.out.println(driver.getTitle());
	}
	
	public void UName() throws IOException, InterruptedException 
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		}
	
	public void Pwd() throws IOException, InterruptedException 
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		 
	}
	
	public void LoginClick() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@class='btn_action']")).click();
		Thread.sleep(3000);
		}
	
	public void Abot() throws InterruptedException {
		driver.findElement(By.xpath("//button[contains(text(),'Open Menu')]")).click();
		driver.findElement(By.xpath("//a[@id='about_sidebar_link']")).click();
		Thread.sleep(3000);
	}
	
	public void signin() throws InterruptedException {
		driver.findElement(By.xpath("//a[@class='button is-rounded is-secondary']")).click();
		Thread.sleep(3000);
		driver.close();
	}

}
