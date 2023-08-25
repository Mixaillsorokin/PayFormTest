package com.Sorokin.tests.checkbox;

import com.Sorokin.pages.PayFormPage;
import com.Sorokin.utilites.Driver;
import org.testng.annotations.Test;

public class test_FPay_37_CheckboxNotActive {
    @Test(description = "Карта не сохраняется для покупок, когда неактивен")
    private void test_FPay_37() {
        PayFormPage pfp = new PayFormPage(Driver.getDriver());
    }
}
