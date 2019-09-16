package com.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources/Feature/Login.feature"}, 
glue= {"com.stepdefinition"} , 
plugin = {"html:target" , "rerun: src/test/resources/failed.text"} 


)
		
public class TestRunner {

}
