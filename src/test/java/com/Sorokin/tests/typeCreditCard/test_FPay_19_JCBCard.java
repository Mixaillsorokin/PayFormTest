package com.Sorokin.tests.typeCreditCard;

import com.Sorokin.pages.PayFormPage;
import com.Sorokin.utilites.Driver;
import org.testng.annotations.Test;

public class test_FPay_19_JCBCard {
    @Test(description = "Определение карты JCB и отображение иконки при вводе  3")
    private void test_FPay_19() {
        PayFormPage pfp = new PayFormPage(Driver.getDriver());
    }
}
