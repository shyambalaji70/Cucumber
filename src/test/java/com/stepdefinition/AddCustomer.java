package com.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.objectrepositary.AddCustomerPage;
import com.resources.FunctionalLibrary;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AddCustomer extends FunctionalLibrary {
	//WebDriver driver;
	//@Given("User is on the login page")
	
	//public void user_is_on_the_login_page() {
	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\FirstProgram\\Driverla\\chromedriver.exe");
	  //  driver = new ChromeDriver();
	//	driver.get("http://demo.guru99.com/telecom/index.html");
	//}

	@When("User enters the details and hits enter")
	public void user_enters_the_details_and_hits_enter() {
	WebElement addcust = driver.findElement(By.xpath("//a[text() ='Add Customer'][1]"));
	addcust.click();
	driver.findElement(By.xpath("//label[@for='done']")).click();
	driver.findElement(By.xpath("//input[@type='text'][1]")).sendKeys("Shyam");
	driver.findElement(By.id("lname")).sendKeys("Balaji");
	driver.findElement(By.id("email")).sendKeys("Shyambalaji@gmail.com");
	driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys("chennai");
	driver.findElement(By.id("telephoneno")).sendKeys("9952702594");
	driver.findElement(By.xpath("//input[@type = 'submit']")).click();
	    
	}
	
	@When("User enters the detail and hits enter")
	public void user_enters_the_detail_and_hits_enter(DataTable datas) {
	    List<String> c = datas.asList(String.class);
	    WebElement addcust = driver.findElement(By.xpath("//a[text() ='Add Customer'][1]"));
		addcust.click();
		driver.findElement(By.xpath("//label[@for='done']")).click();
		driver.findElement(By.xpath("//input[@type='text'][1]")).sendKeys(c.get(0));
		driver.findElement(By.id("lname")).sendKeys(c.get(1));
		driver.findElement(By.id("email")).sendKeys(c.get(2));
		driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys(c.get(3));
		driver.findElement(By.id("telephoneno")).sendKeys(c.get(4));
		driver.findElement(By.xpath("//input[@type = 'submit']")).click();
		    
	    
	}
	
	@When("User enter the detail hits enter")
	public void user_enter_the_detail_hits_enter(DataTable vdata) {
		AddCustomerPage page = new AddCustomerPage();
		button(page.getDoneButton());
		type(page.getFirstName(), "Shyam");
		type(page.getLastName(), "Balaji");
		type(page.getMail(), "shyambalaji@gmail.com");
		type(page.getAddress(), "Chennai");
		type(page.getPhno(), "995272594");
		button(page.getSubmitButton());
		
//	   Map<String, String> d = vdata.asMap(String.class, String.class);
//	   WebElement addcust = driver.findElement(By.xpath("//a[text() ='Add Customer'][1]"));
//		addcust.click();
//		driver.findElement(By.xpath("//label[@for='done']")).click();
//		driver.findElement(By.xpath("//input[@type='text'][1]")).sendKeys(d.get("fname"));
//		driver.findElement(By.id("lname")).sendKeys(d.get("lname"));
//		driver.findElement(By.id("email")).sendKeys(d.get("email"));
//		driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys(d.get("address"));
//		driver.findElement(By.id("telephoneno")).sendKeys(d.get("Ph no"));
//		driver.findElement(By.xpath("//input[@type = 'submit']")).click();
		    
	}


	@Then("Check if customer ID is generated")
	public void check_if_customer_ID_is_generated() {
//		Assert.assertTrue(driver.findElement(By.xpath("(//td[@align= 'center'])[2]")).isDisplayed());
	  
	}



}
