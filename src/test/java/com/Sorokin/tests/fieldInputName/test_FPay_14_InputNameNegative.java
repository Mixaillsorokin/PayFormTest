package com.Sorokin.tests.fieldInputName;

import com.Sorokin.pages.PayFormPage;
import com.Sorokin.utilites.Driver;
import com.Sorokin.utilites.TestBase;
import org.testng.annotations.Test;


public class test_FPay_14_InputNameNegative extends TestBase {
    @Test(description = "Ввод не валидного имени (граничные значения <3 и >40)")
    private void test_FPAY_14(){
        PayFormPage pfp = new PayFormPage(Driver.getDriver());
        pfp.enterName("01");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}

