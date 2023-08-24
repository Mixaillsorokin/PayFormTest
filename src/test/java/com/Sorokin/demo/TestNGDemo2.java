package com.Sorokin.demo;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGDemo2 {

    @Test(description = "Verify page title", dataProvider = "testData")
    public void test5(String url, String title) {
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(driver.getTitle().contains(title),"title not found "+title);
        driver.quit();

    }

    @DataProvider(name = "testData")
    public Object[][] testData() {
        return new Object[][] {
                {"http://google.com", "Google"},
                {"http://amazon.com", "Amazon"},
                {"http://etsy.com", "Etsy"},
                {"http://ebay.com", "Ebay"}
        };
    }
}



