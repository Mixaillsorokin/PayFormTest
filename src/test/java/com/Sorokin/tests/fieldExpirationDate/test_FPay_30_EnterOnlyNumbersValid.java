package com.Sorokin.tests.fieldExpirationDate;

import com.Sorokin.pages.PayFormPage;
import com.Sorokin.utilites.Driver;
import org.testng.annotations.Test;

public class test_FPay_30_EnterOnlyNumbersValid {
    @Test(description = "Ввод только цифры")
    private void test_FPay_30() {
        PayFormPage pfp = new PayFormPage(Driver.getDriver());
    }
}
