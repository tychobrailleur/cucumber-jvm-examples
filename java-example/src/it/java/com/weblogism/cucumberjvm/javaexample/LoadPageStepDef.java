package com.weblogism.cucumberjvm.javaexample;

import static org.junit.Assert.assertTrue;

import com.weblogism.cucumberjvm.javaexample.connectors.WebConnector;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoadPageStepDef {
  private WebConnector connector;

  public LoadPageStepDef(WebConnector connector) {
    this.connector = connector;
  }

  @Given("^I am a user with the splookifying module$")
  public void I_am_a_user_with_the_splookifying_module() {
  }

  @When("^I load the page$")
  public void I_load_the_page() {
    connector.openAndWait("http://localhost:8080/");
  }

  @Then("^I should see a greeting$")
  public void I_should_see_a_greeting() {
    assertTrue(connector.isTextPresent("Hello World"));
  }

}
