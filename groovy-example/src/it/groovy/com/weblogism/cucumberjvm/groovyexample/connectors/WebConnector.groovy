package com.weblogism.cucumberjvm.groovyexample.connectors

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.chrome.ChromeDriver

import java.util.concurrent.TimeUnit

class WebConnector {
    private final static long DEFAULT_TIMEOUT = 2000
    WebDriver driver = new ChromeDriver()

    void clickAndWait(String selector) {
        WebElement element = driver.findElement(By.id(selector))
        element.click()
        driver.manage().timeouts().implicitlyWait(DEFAULT_TIMEOUT, TimeUnit.MILLISECONDS)
    }

    def openAndWait(String location) {
        driver.get(location)
    }

    def close() {
        driver.close()
    }

    boolean isTextPresent(String text) {
        WebElement content = driver.findElement(By.tagName("body"))
        return content.getText().contains(text)
    }

}
