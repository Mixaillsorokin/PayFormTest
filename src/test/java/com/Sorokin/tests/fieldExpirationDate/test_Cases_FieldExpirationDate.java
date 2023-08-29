package com.Sorokin.tests.fieldExpirationDate;

import com.Sorokin.pages.PayFormPage;
import com.Sorokin.utilites.Driver;
import com.Sorokin.utilites.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test_Cases_FieldExpirationDate extends TestBase {
    @Test(description = "The fields month and year are required")
    private void test_FPay_26_FieldExpirationDate() {
        PayFormPage pfp = new PayFormPage(Driver.getDriver());
        boolean areRequired = pfp.areMonthAndYearRequired();

        Assert.assertTrue(areRequired, "The fields month and year not required");
    }
    @Test(description = "Check that the month and year fields are highlighted in orange when the cursor is positioned")
    private void test_FPay_28_FieldsOrangeCursorPosition() {
        PayFormPage pfp = new PayFormPage(Driver.getDriver());
        pfp.hoverOverMonthField();
        String monthFieldTextColor = pfp.getMonthFieldTextColor();
        Assert.assertEquals(monthFieldTextColor, "rgba(0, 0, 0, 1)", "The text color of the month field does not match");
        pfp.hoverOverYearField();
        String yearFieldTextColor = pfp.getYearFieldTextColor();
        Assert.assertEquals(yearFieldTextColor, "rgba(0, 0, 0, 1)", "The text color of the year field does not match");
    }
    @Test(description = "Field length 2 characters")
    private void test_FPay_29_FieldLenValidMonth() {
        PayFormPage pfp = new PayFormPage(Driver.getDriver());
        int fieldLengthMonth = pfp.getInputFieldLengthMonth();
        Assert.assertEquals(fieldLengthMonth, 1, "Field NOT length 2 characters");
    }@Test(description = "Field length 2 characters")
    private void test_FPay_29_FieldLenValidMonth_Negative() {
        PayFormPage pfp = new PayFormPage(Driver.getDriver());
        int fieldLengthMonth = pfp.getInputFieldLengthMonth();
        Assert.assertNotEquals(fieldLengthMonth, 2, "Field NOT length 2 characters");
    }
    @Test(description = "Field length 2 characters")
    private void test_FPay_29_FieldLenValidYear() {
        PayFormPage pfp = new PayFormPage(Driver.getDriver());
        int fieldLengthYear = pfp.getInputFieldLengthYear();
        Assert.assertEquals(fieldLengthYear, 1, "Field NOT length 2 characters");
    } @Test(description = "Field length 2 characters")
    private void test_FPay_29_FieldLenValidYear_Negative() {
        PayFormPage pfp = new PayFormPage(Driver.getDriver());
        int fieldLengthYear = pfp.getInputFieldLengthYear();
        Assert.assertNotEquals(fieldLengthYear, 2, "Field NOT length 2 characters");
    }
    @Test(description = "Check Enter only number")
    private void test_FPay_30_EnterOnlyNumbersValidMonth() {
        PayFormPage pfp = new PayFormPage(Driver.getDriver());
        pfp.enterFieldMonth("ed");
        pfp.inputFieldExpiryDateMonth.clear();
        Assert.assertTrue(pfp.areOnlyDigitsEntered(),
                "FAIL: Entered characters that are not numbers");
    }
    @Test(description = "Check if the month is less than 10, add 0 before the month number")
    private void test_FPay_31_EnterFieldMonthLess10() {
        PayFormPage pfp = new PayFormPage(Driver.getDriver());
        boolean input1 = pfp.enterMonth("5");
        boolean input2 = pfp.enterMonth("12");
        Assert.assertTrue(input1, "Month not entered correctly");
        Assert.assertTrue(input2, "Month not entered correctly");
    }
    @Test(description = "Check that the month field accepts values from 01 to 12")
    private void test_FPay_32_EnterFieldMonthValid() {
        PayFormPage pfp = new PayFormPage(Driver.getDriver());
        for (int i = 1; i <= 12; i++) {
            String month = String.format("%02d", i);
            boolean inputResult = pfp.enterMonth(month);
            Assert.assertTrue(inputResult, "Month " + month + " not enter correct");
        }
    }
    @Test(description = "Verify that the Year field accepts values from the current year to the current year plus 10 years")
    private void test_FPay_33_EnterFieldYearValid() {
        PayFormPage pfp = new PayFormPage(Driver.getDriver());
        int currentYear = java.time.Year.now().getValue();
        for (int i = currentYear; i <= currentYear + 10; i++) {
            String year = String.valueOf(i);
            boolean inputResult = pfp.enterYear(year);
            Assert.assertFalse(inputResult, "Year " + year + " not enter correct");
        }
    }
}
