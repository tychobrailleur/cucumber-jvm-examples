package com.weblogism.cucumberjvm.groovyexample

import io.cucumber.junit.Cucumber
import io.cucumber.junit.CucumberOptions
import org.junit.runner.RunWith

@RunWith(Cucumber)
@CucumberOptions(plugin = 'json:target/report.json')
class RunCukesIT {
}
