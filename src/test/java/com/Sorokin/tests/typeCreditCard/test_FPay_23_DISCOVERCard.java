package com.Sorokin.tests.typeCreditCard;

import com.Sorokin.pages.PayFormPage;
import com.Sorokin.utilites.Driver;
import org.testng.annotations.Test;

public class test_FPay_23_DISCOVERCard {
    @Test(description = "Определение карты DISCOVER и отображение иконки при вводе 60")
    private void test_FPay_23() {
        PayFormPage pfp = new PayFormPage(Driver.getDriver());
    }
}
