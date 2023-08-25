package com.Sorokin.tests.fieldInputName;

import com.Sorokin.pages.PayFormPage;
import com.Sorokin.utilites.Driver;
import com.Sorokin.utilites.TestBase;
import org.testng.annotations.Test;


public class test_FPay_11_FieldInputGreenAndCheckMarkIsDisplayed extends TestBase {
    @Test(description = "Поле подсвечивается зеленым и отображается зеленая галочка, если имя введено")
    private void test_FPay_11(){
        PayFormPage pfp = new PayFormPage(Driver.getDriver());
        pfp.enterName("01");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}

