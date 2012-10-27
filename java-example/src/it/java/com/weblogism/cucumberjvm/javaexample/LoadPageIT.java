package com.weblogism.cucumberjvm.javaexample;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(format = { "json:target/report.json" })
public class LoadPageIT {
}