package com.stepdefinition;



import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class TariffPlan {
	 WebDriver driver;
	@Given("User visits the tariff plan website")
	
	public void user_visits_the_tariff_plan_website() {
		 

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\FirstProgram\\Driverla\\chromedriver.exe");
			
			driver = new ChromeDriver();
			
			driver.get("http://demo.guru99.com/telecom/index.html");
	}

	@Given("Click on Tariff plan option")
	public void click_on_Tariff_plan_option() {
		 driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
	}

	@When("Enters the details")
	public void enters_the_details() {
driver.findElement(By.id("rental1")).sendKeys("15000");
		
		driver.findElement(By.id("local_minutes")).sendKeys("123");
		
		driver.findElement(By.id("inter_minutes")).sendKeys("456");
		
		driver.findElement(By.id("sms_pack")).sendKeys("78");
		
		driver.findElement(By.id("minutes_charges")).sendKeys("130");
		
		driver.findElement(By.id("inter_charges")).sendKeys("96");
		
		driver.findElement(By.id("sms_charges")).sendKeys("130");
	
	  
	}
	


	@When("Enters thee detail")
	public void enters_thee_detail(DataTable tPlan) {

		List<Map<String, String>> data =  tPlan.asMaps(String.class,String.class);
		
		driver.findElement(By.id("rental1")).sendKeys(data.get(0).get("rent"));
		
		driver.findElement(By.id("local_minutes")).sendKeys(data.get(0).get("mins"));
		
		driver.findElement(By.id("inter_minutes")).sendKeys(data.get(0).get("Inter"));
		
		driver.findElement(By.id("sms_pack")).sendKeys(data.get(0).get("sms"));
		
		driver.findElement(By.id("minutes_charges")).sendKeys(data.get(0).get("local"));
		
		driver.findElement(By.id("inter_charges")).sendKeys(data.get(0).get("inters"));
		
		driver.findElement(By.id("sms_charges")).sendKeys(data.get(0).get("charge"));
	}

	@When("Enterss thee detail {string},{string}, {string} , {string} , {string} , {string} , {string}")
	public void enterss_thee_detail(String rent, String mins, String Inter, String Sms, String local, String inters, String charge) {

		
		driver.findElement(By.id("local_minutes")).sendKeys(rent);
		
		driver.findElement(By.id("rental1")).sendKeys(mins);
		
		driver.findElement(By.id("inter_minutes")).sendKeys(Inter);
		
		driver.findElement(By.id("sms_pack")).sendKeys(Sms);
		
		driver.findElement(By.id("minutes_charges")).sendKeys(local);
		
		driver.findElement(By.id("inter_charges")).sendKeys(inters);
		
		driver.findElement(By.id("sms_charges")).sendKeys(charge);
	}

	@When("Submits the details")
	public void submits_the_details() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();;
	}

	@Then("Tariff plan is generated")
	public void tariff_plan_is_generated() {
	   
	}

}
