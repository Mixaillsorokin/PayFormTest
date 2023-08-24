package com.Sorokin.test;

import com.Sorokin.pages.PayFormPage;
import com.Sorokin.utilites.TestBase;

import org.testng.annotations.Test;


public class test_NamePage extends TestBase {
    @Test(description = "Enter name")
    private void test1(){
        PayFormPage pfp = new PayFormPage();
        pfp.enterName("62");
    }
}
