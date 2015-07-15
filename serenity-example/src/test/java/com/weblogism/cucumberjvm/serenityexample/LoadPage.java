package com.weblogism.cucumberjvm.serenityexample;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;


@DefaultUrl("http://localhost:9000/hello")
public class LoadPage extends PageObject {
  WebElementFacade searchButton;
  WebElementFacade keywords;

  public LoadPage(WebDriver driver) {
    super(driver);
  }

  public void look_for_jobs_with_keywords(String values) {
    typeInto(keywords, values);
    searchButton.click();
  }
}
