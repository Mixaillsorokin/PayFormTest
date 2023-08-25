package com.Sorokin.tests.fieldCVC;

import com.Sorokin.pages.PayFormPage;
import com.Sorokin.utilites.Driver;
import org.testng.annotations.Test;

public class test_FPay_35_FieldCVCRangeValid {
    @Test(description = "Ввод только в диапазоне от 001 до 999")
    private void test_FPay_35() {
        PayFormPage pfp = new PayFormPage(Driver.getDriver());
    }
}
