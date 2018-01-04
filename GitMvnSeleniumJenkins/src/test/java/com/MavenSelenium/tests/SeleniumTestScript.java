package com.MavenSelenium.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SeleniumTestScript {
	
	@Test
	public void testMethod1(){
		System.out.println("Welcome to continuous integration");
	}
	
	
//	@Test
//	public void method1(){
//		//System.setProperty("webdriver.gecko.driver", "D:\\Training\\TrainingContent\\SeleniumJars_Software\\geckodriver_64\\geckodriver.exe");
//		
//		WebDriver driver = new FirefoxDriver();
//		driver.get("http://demo.automationtesting.in/Register.html");
//		driver.manage().window().maximize();
//		//name and address
//		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Vinayak");
//		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Aundh");
//		//radiobutton
//		driver.findElement(By.xpath("//input[@value='Male']")).click();
//		//checkbox
//		
//	}
}
