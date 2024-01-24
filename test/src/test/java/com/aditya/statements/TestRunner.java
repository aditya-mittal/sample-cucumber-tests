package com.aditya.statements;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.aditya.statements",
        plugin = {"pretty", "html:target/cucumber-reports"}
)
@PropertySource("classpath:application.properties")
@ComponentScan("com.aditya.statements")
public class TestRunner {
}
