package com.Sorokin.utilites;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import java.util.concurrent.TimeUnit;

public class TestBase {
    @BeforeSuite
    public void setup(){
        Driver.getDriver();
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        Driver.getDriver().manage().timeouts().implicitlyWait(Long.valueOf(ConfigReader.getProperty("implicitwait")), TimeUnit.SECONDS);
    }
    @AfterSuite
    public void teardown(){Driver.closeDriver();}
}
