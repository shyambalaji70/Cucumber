package com.resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FunctionalLibrary {
	public static WebDriver driver;
	public static void launch(String Url) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\FirstProgram\\Driverla\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(Url);

	}
	
	public static void type(WebElement ele , String value) {
		ele.sendKeys(value);
	
	}
	
	public static void button(WebElement ele) {
		
		ele.click();

	}

}
