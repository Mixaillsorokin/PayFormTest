package com.Sorokin.tests.buttonPay;

import com.Sorokin.pages.PayFormPage;
import com.Sorokin.utilites.Driver;
import org.testng.annotations.Test;

public class test_FPay_39_ColorButtonGreenEnterAllFields {
    @Test(description = "Цвет зеленый, когда все поля заполнены")
    private void test_FPay_39() {
        PayFormPage pfp = new PayFormPage(Driver.getDriver());
    }
}
