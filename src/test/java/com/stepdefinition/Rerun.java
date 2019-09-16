package com.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources/Feature/Tariff.feature"}, 
glue= {"com.stepdefinition"} , 
plugin = {"html:target1" , "rerun: src/test/resources/failed.text"} ,
dryRun=false ,
monochrome = true
)
public class Rerun {

}
