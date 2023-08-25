package com.Sorokin.tests.fieldCVC;

import com.Sorokin.pages.PayFormPage;
import com.Sorokin.utilites.Driver;
import org.testng.annotations.Test;

public class test_FPay_27_FieldCVCLenValid {
    @Test(description = "Длина поля равна 3")
    private void test_FPay_27() {
        PayFormPage pfp = new PayFormPage(Driver.getDriver());
    }
}
