package com.Sorokin.utilites;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;


public class TestBase {
    @BeforeMethod
    public void setup(){
        Driver.getDriver();
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(Long.valueOf(ConfigReader.getProperty("implicitwait")), TimeUnit.SECONDS);


    }

    @AfterMethod
    public void teardown(){Driver.closeDriver();}
}
