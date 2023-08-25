package com.Sorokin.tests.typeCreditCard;

import com.Sorokin.pages.PayFormPage;
import com.Sorokin.utilites.Driver;
import org.testng.annotations.Test;

public class test_FPay_21_MAESTROCard {
    @Test(description = "Определение карты MAESTRO и отображение иконки при вводе  55")
    private void test_FPay_21() {
        PayFormPage pfp = new PayFormPage(Driver.getDriver());
    }
}
