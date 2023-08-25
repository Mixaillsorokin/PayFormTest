package com.Sorokin.tests.fieldExpirationDate;

import com.Sorokin.pages.PayFormPage;
import com.Sorokin.utilites.Driver;
import org.testng.annotations.Test;

public class test_FPay_28_FieldsOrangeCursorPosition {
    @Test(description = "Поля подсвечиваются оранжевым при установленном курсоре")
    private void test_FPay_28() {
        PayFormPage pfp = new PayFormPage(Driver.getDriver());
    }
}
