package com.Sorokin.tests.typeCreditCard;

import com.Sorokin.pages.PayFormPage;
import com.Sorokin.utilites.Driver;
import org.testng.annotations.Test;

public class test_FPay_17_MasterCardCard {
    @Test(description = "Определение карты MasterCard и отображение иконки при вводе 5")
    private void test_FPay_17() {
        PayFormPage pfp = new PayFormPage(Driver.getDriver());
    }
}
