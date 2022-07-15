package com.shoppingsite.pages;
import commonLibs.implementation.ElementControl;
import org.openqa.selenium.WebDriver;

public class BasePage {
    private final WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        ElementControl elementControl = new ElementControl(driver);
    }
}
