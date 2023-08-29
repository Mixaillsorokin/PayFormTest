package com.Sorokin.tests.fieldCVC;

import com.Sorokin.pages.PayFormPage;
import com.Sorokin.utilites.Driver;
import com.Sorokin.utilites.TestBase;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class test_Cases_FieldCVCValid extends TestBase {
    @Test(description = "Checking if the field length is 3")
    private void test_FPay_27_CVCLenValid() {
        PayFormPage pfp = new PayFormPage(Driver.getDriver());
        int fieldLength = pfp.getInputFieldLength();
        Assert.assertEquals(fieldLength, 1, "Length field CVC not '3' ");
    }@Test(description = "Checking if the field length is 3")
    private void test_FPay_27_CVCLenValid_Negative() {
        PayFormPage pfp = new PayFormPage(Driver.getDriver());
        int fieldLength = pfp.getInputFieldLength();
        Assert.assertNotEquals(fieldLength, 3, "Length field CVC not '3' ");
    }

    @Test(description = "Enter only number")
    private void test_FPay_34_FieldCVCEnterOnlyNumberValid() {
        PayFormPage pfp = new PayFormPage(Driver.getDriver());
        pfp.enterFieldCVC("123");
        Assert.assertTrue(pfp.areOnlyDigitsEntered(),
                "Enter NOT only number");
    }

    @Test(description = "Enter only range (001...999)")
    private void test_FPay_35_FieldCVCRangeValid() {
        PayFormPage pfp = new PayFormPage(Driver.getDriver());
        pfp.enterFieldCVC(pfp.formatNumber(123));
        throw new SkipException("Skipped");
//        Assert.assertFalse(pfp.areNumbersInRange("12"),
//                "Number not range(001...999)");
    }
}
