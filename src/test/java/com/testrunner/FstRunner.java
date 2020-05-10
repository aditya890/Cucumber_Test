package com.testrunner;

//import org.junit.runner.RunWith;
//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


//@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"html:target/cucumber-reports","json:target/reports.json","testNG:target/reports.xml" }, features = { "src/test/resources" }, glue = { "src/test/java/com/stepdef" }, tags = { "" }, monochrome = true, dryRun =false,strict=true)

//public class FstRunner  {
//
//}
public class FstRunner extends AbstractTestNGCucumberTests {

}
