package com.Sorokin.tests.typeCreditCard;

import com.Sorokin.pages.PayFormPage;
import com.Sorokin.utilites.Driver;
import org.testng.annotations.Test;

public class test_FPay_18_AMERICAN_EXPRESSCard {
    @Test(description = "Определение карты AMERICAN_EXPRESS и отображение иконки при вводе 34,37")
    private void test_FPay_18() {
        PayFormPage pfp = new PayFormPage(Driver.getDriver());
    }
}
