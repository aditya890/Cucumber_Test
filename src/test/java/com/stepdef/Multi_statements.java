package com.stepdef;

import java.util.List;
import java.util.Map;

import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Multi_statements {
	
	static String a;
	static String b;
	static String c;
	static String result;
	@Given("I have  datatable of three words for maps")
	@Given("We have three word which are completely different.")
	public void mapping(DataTable values)
	{
		//It used as when you want to provide headers on datatable
		//It will read header values as map key and first row as value corrosponding to those keys.
     List<Map<String,String>>  data =  values.asMaps(String.class,String.class);
		a=data.get(0).get("firstname");
		b=data.get(0).get("lastname");
		c=data.get(0).get("thirdname");
		System.out.println(data.get(0).get("thirdname"));
		System.out.println("Assigned values to string variables.");
	}
	
	@When("I join three words")
	public void  addingTheNum2()
	{
		result = a +b+c;
		System.out.println("Added them");
	}

	@Then("It should match the following value below")
	public void it_should_match_the_following_value1(DataTable data) {
		Assert.assertEquals(data.asList().get(0), result);
	}
}
