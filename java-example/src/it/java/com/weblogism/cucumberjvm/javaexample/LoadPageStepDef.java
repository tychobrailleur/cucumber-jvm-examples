package com.weblogism.cucumberjvm.javaexample;

import static org.junit.Assert.assertTrue;

import com.thoughtworks.selenium.DefaultSelenium;

import cucumber.annotation.After;
import cucumber.annotation.Before;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

public class LoadPageStepDef {
  private DefaultSelenium seleniumClient = new DefaultSelenium("localhost", 4444, "*firefox",
      "http://localhost:8080");

  @Before
  public void initSelenium() throws Exception {
    seleniumClient.start();
  }

  @Given("^I am a user with the splookifying module$")
  public void I_am_a_user_with_the_splookifying_module() {
  }

  @When("^I load the page$")
  public void I_load_the_page() {
    seleniumClient.open("/");
    seleniumClient.waitForPageToLoad("5000");
  }

  @Then("^I should see a greeting$")
  public void I_should_see_a_greeting() {
    System.out.println(seleniumClient.getBodyText());
    assertTrue(seleniumClient.isTextPresent("Hello World"));
  }

  @After
  public void destroySelenium() {
    seleniumClient.stop();
  }
}
