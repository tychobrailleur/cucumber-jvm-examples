package com.weblogism.cucumberjvm.javaexample;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = "json:target/report.json", strict = true)
public class RunCukesIT {
}
