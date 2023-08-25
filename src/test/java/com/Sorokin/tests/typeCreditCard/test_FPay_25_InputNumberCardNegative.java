package com.Sorokin.tests.typeCreditCard;

import com.Sorokin.pages.PayFormPage;
import com.Sorokin.utilites.Driver;
import org.testng.annotations.Test;

public class test_FPay_25_InputNumberCardNegative {
    @Test(description = "Вод не валидного номера карты (спец. символы, буквы, длина <12 и >19)")
    private void test_FPay_25() {
        PayFormPage pfp = new PayFormPage(Driver.getDriver());
    }
}
