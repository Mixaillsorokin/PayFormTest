package com.Sorokin.utilites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {
    @BeforeMethod
    public void setup() throws InterruptedException {
        Driver.getDriver();
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        Thread.sleep(10000);
//        Driver.getDriver().manage().timeouts().implicitlyWait(Long.valueOf(ConfigReader.getProperty("implicitwait")), TimeUnit.SECONDS);
        Driver.getDriver().manage().window().maximize();


    }

    @AfterMethod
    public void teardown(){Driver.closeDriver();}
}
