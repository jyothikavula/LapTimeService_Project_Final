package com.example.spring_thymeleaf;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;


public class BaseTest {
    protected WebDriver driver;

    protected LandingPage landingPage;

    @BeforeEach
    public void setUp() {
        WebDriverManager.edgedriver().setup();
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new EdgeDriver(options);
        driver.manage().window().maximize();
        driver.get("http://localhost:8080/laptimes");
        landingPage = new LandingPage();
        BasePage.setDriver(driver);
    }

    @AfterEach
    public void tearDown () {
        driver.quit();
    }
}

