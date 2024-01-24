package com.aditya.statements.stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import static org.junit.Assert.assertEquals;

public class SampleStepDefinitions {
    int a,b,c;

    @Given("I have two numbers")
    public void i_have_a_sample_step() {
        a=2;
        b=3;
    }

    @When("I perform an addition")
    public void i_perform_an_action() {
        c=a+b;
    }

    @When("I perform a subtraction")
    public void iPerformASubtraction() {
        c=a-b;
    }

    @Then("I should see the result as addition of two numbers")
    public void i_should_see_the_result() {
        assertEquals(5,c);
    }
}

