package com.ynap.wcs.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features={"classpath:features"},
        glue={"com.ynap.wcs.stepdefs"}
)
public class TestRunner {
}
