package com.Sorokin.test;

import com.Sorokin.pages.PayFormPage;
import com.Sorokin.utilites.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class test_NamePage extends TestBase {
    @Test(description = "Enter name")
    private void test1(){
        PayFormPage pfp = new PayFormPage();
        pfp.enterName();
    }
}
