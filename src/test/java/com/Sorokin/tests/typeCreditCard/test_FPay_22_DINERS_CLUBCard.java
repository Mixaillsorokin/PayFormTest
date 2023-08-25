package com.Sorokin.tests.typeCreditCard;

import com.Sorokin.pages.PayFormPage;
import com.Sorokin.utilites.Driver;
import org.testng.annotations.Test;

public class test_FPay_22_DINERS_CLUBCard {
    @Test(description = "Определение карты DINERS_CLUB и отображение иконки при вводе 69")
    private void test_FPay_22() {
        PayFormPage pfp = new PayFormPage(Driver.getDriver());
    }
}
