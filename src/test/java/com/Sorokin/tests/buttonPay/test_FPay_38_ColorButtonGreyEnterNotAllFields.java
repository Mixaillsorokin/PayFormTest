package com.Sorokin.tests.buttonPay;

import com.Sorokin.pages.PayFormPage;
import com.Sorokin.utilites.Driver;
import org.testng.annotations.Test;

public class test_FPay_38_ColorButtonGreyEnterNotAllFields {
    @Test(description = "Цвет серый, когда не все поля заполнены")
    private void test_FPay_38() {
        PayFormPage pfp = new PayFormPage(Driver.getDriver());
    }
}
