package com.Sorokin.tests.fieldCVC;

import com.Sorokin.pages.PayFormPage;
import com.Sorokin.utilites.Driver;
import org.testng.annotations.Test;

public class test_FPay_34_FieldCVCEnterOnlyNumberValid {
    @Test(description = "Ввод только цифр")
    private void test_FPay_34() {
        PayFormPage pfp = new PayFormPage(Driver.getDriver());
    }
}
