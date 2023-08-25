package com.Sorokin.tests.fieldInputName;

import com.Sorokin.pages.PayFormPage;
import com.Sorokin.utilites.Driver;
import com.Sorokin.utilites.TestBase;
import org.testng.annotations.Test;


public class test_FPay_12_DisplayingTooltipNotEnteAndClickButtonPay extends TestBase {
    @Test(description = "Отображение тултипа, если пользователь ничего не ввел и нажал кнопку 'Оплатить'")
    private void test_FPay_12(){
        PayFormPage pfp = new PayFormPage(Driver.getDriver());
        pfp.enterName("01");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}

