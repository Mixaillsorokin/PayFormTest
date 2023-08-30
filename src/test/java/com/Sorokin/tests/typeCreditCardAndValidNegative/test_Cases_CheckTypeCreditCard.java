package com.Sorokin.tests.typeCreditCardAndValidNegative;

import com.Sorokin.pages.PayFormPage;
import com.Sorokin.utilites.Driver;
import com.Sorokin.utilites.TestBase;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class test_Cases_CheckTypeCreditCard extends TestBase {
    @Test(description = "Defining card and displaying icons",dataProvider = "testData1")
    public void test_FPay_16_23_CreditCardNegative(String number, String type) {
        PayFormPage pfp = new PayFormPage(Driver.getDriver());
        pfp.enterCreditCardNum(number);
        String actualType = pfp.getAttributeCC("class");
        pfp.deleteCreditCardNum();
        Assert.assertTrue(actualType.contains(type),"Under the number '"+ number +"' card '"+ type +"' is not detected, the icon is not displayed!");
    }

    @DataProvider(name = "testData1")
    public Object[][] testData1() {
        return new Object[][] {
                {"1", "visa"},
                {"62", "master-card"},
                {"34", "american-express"},
                {"37", "american-express"},
                {"60", "discover"}
        };
    }
    @Test(description = "Defining card and displaying icons",dataProvider = "testData2")
    public void test_FPay_16_23_CreditCardPositive(String number, String type) {
        PayFormPage pfp = new PayFormPage(Driver.getDriver());
        pfp.inputFieldCreditCard.clear();
        pfp.enterCreditCardNum(number);
        String actualType = pfp.getAttributeCC("class");
        pfp.deleteCreditCardNum();
        Assert.assertFalse(actualType.contains(type),"Under the number '"+ number +"' card '"+ type +"' is not detected, the icon is not displayed!");
    }

    @DataProvider(name = "testData2")
    public Object[][] testData2() {
        return new Object[][] {
                {"4", "visa"},
                {"5", "master-card"},
                {"3", "jsb"},
                {"62", "unionpay"},
                {"55", "maestro"},
                {"69", "diners-club"}

        };
    }
    @Test(description = "Entering a valid card number (from 12 to 19 characters depending on the payment system of the card")
    private void test_FPay_24_InputNumberCardValid() {
        PayFormPage pfp = new PayFormPage(Driver.getDriver());
        pfp.enterCreditCardNum("123456789012");
        pfp.deleteCreditCardNum();
    }

    @Test(description = "Enter invalid card number (special characters, letters, length <12 and >19)")
    private void test_FPay_25_InputNumberCardSpecialChar_Negative() {
        PayFormPage pfp = new PayFormPage(Driver.getDriver());
        boolean input1 = pfp.enterCreditCardNumber("1234ABCD5678");
        Assert.assertFalse(input1, "FAIL: Card number contains special characters or letters");

    }@Test(description = "Enter invalid card number (special characters, letters, length <12 and >19)")
    private void test_FPay_25_InputNumberCardInvalidLen_Negative() {
        PayFormPage pfp = new PayFormPage(Driver.getDriver());
        boolean input2 = pfp.enterCreditCardNumber("12345678901234567890");
        Assert.assertFalse(input2, "FAIL: The card number has an invalid length");
    }
}
