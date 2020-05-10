package com.stepdef;



import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StringJoin {
	
	static String a;
	static String b;
	static String result;
	
	@Given("I have two strings {string} and {string}.")
	public void i_have_two_strings_and(String first, String second) {
		a=first;
		b=second;
		System.out.println("Assigned values to string variables.");
	}

	@When("I join them")
	public void i_join_them() {
		result = a +b;
		System.out.println("Added them");
	}

	@Then("Final Value should be {string}")
	public void final_Value_should_be(String res) {
		Assert.assertEquals(res, result);
		System.out.println("verified.");
	}
}
