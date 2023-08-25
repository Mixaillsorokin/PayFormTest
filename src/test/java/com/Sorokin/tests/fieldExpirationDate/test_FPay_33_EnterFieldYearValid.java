package com.Sorokin.tests.fieldExpirationDate;

import com.Sorokin.pages.PayFormPage;
import com.Sorokin.utilites.Driver;
import org.testng.annotations.Test;

public class test_FPay_33_EnterFieldYearValid {
    @Test(description = "В поле года возможен ввод значений от текущего года до текущего года плюс 10 лет")
    private void test_FPay_33() {
        PayFormPage pfp = new PayFormPage(Driver.getDriver());
    }
}
