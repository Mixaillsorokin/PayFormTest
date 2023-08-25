package com.Sorokin.tests.fieldExpirationDate;

import com.Sorokin.pages.PayFormPage;
import com.Sorokin.utilites.Driver;
import org.testng.annotations.Test;

public class test_FPay_29_FieldLenValid {
    @Test(description = "Длина полей 2 символа")
    private void test_FPay_29() {
        PayFormPage pfp = new PayFormPage(Driver.getDriver());
    }
}
