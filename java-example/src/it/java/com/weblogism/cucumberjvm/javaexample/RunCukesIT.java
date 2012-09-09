package com.weblogism.cucumberjvm.javaexample;

import org.junit.runner.RunWith;

import cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(format = { "json:target/report.json" })
public class RunCukesIT {
}