package com.weblogism.cucumberjvm.serenityexample;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoadPageStepDef {

  LoadPage loadPage;

  @Before
  public void beforeScenario() {
    System.out.println(" *** Before");
  }

  @After
  public void afterScenario() {
    System.out.println(" *** After");
  }

  @Given("^I am a user with the splookifying module$")
  public void I_am_a_user_with_the_splookifying_module() {
  }

  @When("^I load the page$")
  public void I_load_the_page() {
    loadPage.open();
  }

  @Then("^I should see a greeting$")
  public void I_should_see_a_greeting() {
    loadPage.look_for_jobs_with_keywords("test");
  }

}
