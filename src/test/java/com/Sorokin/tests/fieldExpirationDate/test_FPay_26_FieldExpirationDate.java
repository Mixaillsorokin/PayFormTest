package com.Sorokin.tests.fieldExpirationDate;

import com.Sorokin.pages.PayFormPage;
import com.Sorokin.utilites.Driver;
import org.testng.annotations.Test;

public class test_FPay_26_FieldExpirationDate {
    @Test(description = "Поля число и дата являются обязательными")
    private void test_FPay_26() {
        PayFormPage pfp = new PayFormPage(Driver.getDriver());
    }
}
