package com.weblogism.cucumberjvm.javaexample.connectors;

import com.thoughtworks.selenium.DefaultSelenium;

import cucumber.annotation.After;
import cucumber.annotation.Before;

public class WebConnector {
  private final static String DEFAULT_TIMEOUT = "2000";
  private DefaultSelenium seleniumClient = new DefaultSelenium("localhost", 4444, "*firefox",
      "http://localhost:8080");

  @Before
  public void initSelenium() throws Exception {
    seleniumClient.start();
  }

  @After
  public void destroySelenium() {
    seleniumClient.stop();
  }

  public void clickAndWait(String selector) {
    seleniumClient.click(selector);
    seleniumClient.waitForPageToLoad(DEFAULT_TIMEOUT);
  }

  public void openAndWait(String location) {
    seleniumClient.open(location);
    seleniumClient.waitForPageToLoad(DEFAULT_TIMEOUT);
  }

  public boolean isTextPresent(String text) {
    return seleniumClient.isTextPresent(text);
  }
}
