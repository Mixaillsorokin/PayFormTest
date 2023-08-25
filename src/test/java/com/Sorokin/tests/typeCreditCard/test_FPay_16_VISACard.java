package com.Sorokin.tests.typeCreditCard;

import com.Sorokin.pages.PayFormPage;
import com.Sorokin.utilites.Driver;
import org.testng.annotations.Test;

public class test_FPay_16_VISACard {
    @Test(description = "Определение карты VISA и отображение иконки при вводе  4")
    private void test_FPay_16() {
        PayFormPage pfp = new PayFormPage(Driver.getDriver());
    }
}
