package com.weblogism.cucumberjvm.groovyexample

import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber
import org.junit.runner.RunWith

@RunWith(Cucumber)
@CucumberOptions(plugin = 'json:target/report.json')
class RunCukesIT {
}
