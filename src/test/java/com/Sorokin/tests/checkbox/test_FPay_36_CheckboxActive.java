package com.Sorokin.tests.checkbox;

import com.Sorokin.pages.PayFormPage;
import com.Sorokin.utilites.Driver;
import org.testng.annotations.Test;

public class test_FPay_36_CheckboxActive {
    @Test(description = "Карта сохраняется для покупок, когда активен")
    private void test_FPay_36() {
        PayFormPage pfp = new PayFormPage(Driver.getDriver());
    }
}
