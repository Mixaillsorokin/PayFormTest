package com.Sorokin.tests.buttonPay;

import com.Sorokin.pages.PayFormPage;
import com.Sorokin.utilites.Driver;
import org.testng.annotations.Test;

public class test_FPay_40_DisplayPaymentAmount {
    @Test(description = "Отображение суммы для оплаты (в формате NN рубля/рублей/рубль NN копеек/копейка)")
    private void test_FPay_40() {
        PayFormPage pfp = new PayFormPage(Driver.getDriver());
    }
}
