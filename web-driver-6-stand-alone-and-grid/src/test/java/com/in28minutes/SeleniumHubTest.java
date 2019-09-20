package com.in28minutes;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumHubTest {
	//selenium-standalone start -- -role hub

	

	@Test(threadPoolSize=2, invocationCount=4)
	public void hub_chrome() throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities capabilites = new DesiredCapabilities();
		
		//chrome, firefox, htmlunit, internet explorer, iphone, opera
		capabilites.setBrowserName("chrome");

		WebDriver remoteDriver = new RemoteWebDriver(
				new URL("http://34.69.21.56:4444/wd/hub"), capabilites);
		

		
		remoteDriver.get("http://34.69.21.56:8080/pages/index.html");
		System.out.println(remoteDriver.getCurrentUrl());
		System.out.println(remoteDriver.getTitle());
		Thread.sleep(10000);
		remoteDriver.quit();
	}

	@Test(threadPoolSize=2, invocationCount=4)
	public void hub_firefox() throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities capabilites = new DesiredCapabilities();
		
		
		capabilites.setBrowserName("firefox");
		
		
		WebDriver remoteDriver = new RemoteWebDriver(
				new URL("http://34.69.21.56:4444/wd/hub"), capabilites);
		
		
		remoteDriver.get("http://34.69.21.56:8080/pages/index.html");
		System.out.println(remoteDriver.getCurrentUrl());
		System.out.println(remoteDriver.getTitle());
		Thread.sleep(10000);
		remoteDriver.quit();
	}
	
}
