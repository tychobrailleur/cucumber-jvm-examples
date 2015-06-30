package com.weblogism.cucumberjvm.javaexample.connectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import java.util.concurrent.TimeUnit;


public class WebConnector {
    private final static long DEFAULT_TIMEOUT = 2000;
    // to visually see the page loaded replace HtmlUnitDriver with FirefoxDriver, ChromeDriver, InternetExplorerDriver, SafariDriver
    WebDriver driver = new HtmlUnitDriver();
    
    @Before
    public void initSelenium() throws Exception {
    }

    @After
    public void destroySelenium() {
        driver.close();
    }
    
    public void clickAndWait(String selector) {
        WebElement element = driver.findElement(By.id(selector));
        element.click();
        driver.manage().timeouts().implicitlyWait(DEFAULT_TIMEOUT, 
                                                  TimeUnit.MILLISECONDS);
    }

    public void openAndWait(String location) {
        driver.get(location);
        // driver.manage().timeouts().implicitlyWait(DEFAULT_TIMEOUT, 
        // 					  TimeUnit.MILLISECONDS);
    }
    
    public boolean isTextPresent(String text) {
        WebElement content = driver.findElement(By.tagName("body")); 
        return content.getText().contains(text);
    }
}
