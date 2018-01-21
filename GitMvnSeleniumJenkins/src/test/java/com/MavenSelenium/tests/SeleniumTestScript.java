package com.MavenSelenium.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SeleniumTestScript {
	
	@Test
	public void testMethod1(){
		System.out.println("Test B13 : Welcome to continuous integration");
	}
	
	
	@Test
	public void method1(){
		System.out.println("for batch13");
		System.setProperty("webdriver.chrome.driver","D:\\Training\\TrainingContent\\SeleniumJars_Software\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		//name and address
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Vinayak");
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Aundh");
		//radiobutton
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		//checkbox
		
	}
}
