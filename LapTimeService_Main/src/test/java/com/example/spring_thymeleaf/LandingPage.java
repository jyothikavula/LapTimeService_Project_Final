package com.example.spring_thymeleaf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class LandingPage extends BasePage {

    By inputSearch = By.id("input-laptime");
    By saveButton = By.id("save-button");
    By logOfTheLapTime = By.xpath("/html/body/div/div[1]/h3");
    static By AddNewLapTime = By.id("addtodo-button");


    public void LapTimeInput(String lapTime) {
        sendKeys(inputSearch, lapTime);
    }

    public void LapTimeSaveButton() {
        click(saveButton);
    }

    public String getText(By locator) {

        return find(locator).getText();
    }

    public LandingPage addNewLapTimeButton(){
        click(AddNewLapTime);
        return new LandingPage();
    }

    public  WebElement find(By locator) {

        return driver.findElement(locator);
    }

    public  void click(By locator) {
        find(locator).click();
    }

    public void sendKeys(By locator, String input) {
        find(locator).sendKeys(input);
    }

    public String getTextOfTheLapTime() {
        return getText(logOfTheLapTime);

    }
}
