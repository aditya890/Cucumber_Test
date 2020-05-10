package com.stepdef;

import java.util.List;

import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DatatableSteps {
	static String a;
	static String b;
	static String result;
	
	@Given("I have  datatable of two words")
	public void i_have_datatable_of_two_words(DataTable values) {

		 //Horizontal and vertical rows reading
		//		List<List<String>> testData = values.asLists();  
			
		//Horizontal row reading in list
		List<String> data =  values.asList();  
			a=data.get(0);
			b=data.get(1);
			System.out.println("Assigned values to string variables.");
	}
	
	@When("I join two words")
	public void  addingTheNum1()
	{
		result = a +b;
		System.out.println("Added them");
	}

	@Then("It should match the following value")
	public void it_should_match_the_following_value(DataTable data) {
		Assert.assertEquals(data.asList().get(0), result);
	}
	
}
