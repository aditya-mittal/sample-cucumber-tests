package com.aditya.statements;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertEquals;

public class SampleStepDefinitions {
    int a,b,c;

    @Autowired
    private String appName;

    @Autowired
    private String appVersion;

    @Given("I have a sample step")
    public void i_have_a_sample_step() {
        System.out.println("Application Name: " + this.appName);
        System.out.println("Application Version: " + this.appVersion);
    }

    @Given("I have two numbers")
    public void iHaveTwoNumbers() {
        a=2;
        b=3;
    }

    @When("I perform an addition")
    public void iPerformAnAddition() {
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

