package com.example.spring_thymeleaf;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddNewLapTimeTest extends BaseTest {

    LandingPage addNewLapTime;

    @Test

    public void testLandingPage(){
        addNewLapTime = landingPage.addNewLapTimeButton();
        String input= "5";
        addNewLapTime.LapTimeInput(input);
        addNewLapTime.LapTimeSaveButton();
        String status= addNewLapTime.getTextOfTheLapTime();
        String expected= "Varvtid: 5.0";
        Assertions.assertEquals(status,expected);
    }
}
