import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import cucumber.api.java.After;
import cucumber.api.java.Before;


public class CheckoutSteps {
  @Before
  public void beforeScenario() {
    System.out.println(" *** Before");
  }

  @After
  public void afterScenario() {
    System.out.println(" *** After");
  }

    @Given("^the price of a \"([^\"]+)\" is 40c$")
    public void the_price_of_a_is(String fruit) {
        System.out.println("Fruit is " + fruit);
    }
}
