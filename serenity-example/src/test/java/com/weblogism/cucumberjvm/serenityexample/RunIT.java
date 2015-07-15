package com.weblogism.cucumberjvm.serenityexample;

import org.junit.runner.RunWith;

import net.serenitybdd.cucumber.CucumberWithSerenity;
import cucumber.api.CucumberOptions;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin = "json:target/report.json")
public class RunIT {
}
