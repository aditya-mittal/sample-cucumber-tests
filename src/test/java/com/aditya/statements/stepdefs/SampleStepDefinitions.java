package com.aditya.statements.stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import static org.junit.Assert.assertEquals;

public class SampleStepDefinitions {
    int a,b,c;

    @Given("I have a sample step")
    public void i_have_a_sample_step() {
        a=2;
        b=3;
    }

    @When("I perform an action")
    public void i_perform_an_action() {
        c=a-b;
    }

    @Then("I should see the result")
    public void i_should_see_the_result() {
        assertEquals(5,c);
    }
}

