package com.Sorokin.tests.fieldInputName;

import com.Sorokin.pages.PayFormPage;
import com.Sorokin.utilites.Driver;
import com.Sorokin.utilites.TestBase;
import org.testng.annotations.Test;


public class test_FPay_10_FieldNotInputRedAndCrossIsDisplayed extends TestBase {
    @Test(description = "Поле подсвечивается красным и отображается крестик, если ничего не введено")
    private void test_FPay_10(){
        PayFormPage pfp = new PayFormPage(Driver.getDriver());
        pfp.enterName("01");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}

