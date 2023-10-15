package com.example.spring_thymeleaf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

    public static WebDriver driver;

    public static void setDriver(WebDriver driver) {
        BasePage.driver = driver;
    }

    public String getText(By locator) {

        return find(locator).getText();
    }

    public WebElement find(By locator) {

        return driver.findElement(locator);
    }

    public  void click(By locator) {
        find(locator).click();
    }

    public void sendKeys(By locator, String input) {
        find(locator).sendKeys(input);
    }

    }

