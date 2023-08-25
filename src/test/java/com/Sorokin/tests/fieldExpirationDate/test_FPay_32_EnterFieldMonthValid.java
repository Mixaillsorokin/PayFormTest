package com.Sorokin.tests.fieldExpirationDate;

import com.Sorokin.pages.PayFormPage;
import com.Sorokin.utilites.Driver;
import org.testng.annotations.Test;

public class test_FPay_32_EnterFieldMonthValid {
    @Test(description = "В поле месяца возможен ввод значений от 01 до 12")
    private void test_FPay_32() {
        PayFormPage pfp = new PayFormPage(Driver.getDriver());
    }
}
