package com.Sorokin.tests.modalFieldsDisplay;

import com.Sorokin.pages.PayFormPage;
import com.Sorokin.utilites.Driver;
import com.Sorokin.utilites.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test_Cases_FieldsDisplayed extends TestBase {

    @Test(priority = 1, description = "Checking the display of the name input field")
    private void test_FPay_1(){
        PayFormPage pfp = new PayFormPage(Driver.getDriver());
        Assert.assertTrue(pfp.fieldNameIsDisplay(), "FAIL: Field Name not is displayed");

    }
    @Test(priority = 2, description = "Checking the display of the card number field")
    private void test_FPay_2_CreditCardField(){
        PayFormPage pfp = new PayFormPage(Driver.getDriver());
        Assert.assertTrue(pfp.fieldEnterCreditCard(), "FAIL: Field Enter Credit Card not is displayed");
    }
    @Test(priority = 3, description = "Checking the display of the expiration date field Month")
    private void test_FPay_3_fieldMonth() {
        PayFormPage pfp = new PayFormPage(Driver.getDriver());
        Assert.assertTrue(pfp.fieldEnterMonth(), "FAIL: Field Enter Month NOT is displayed");
    }
    @Test(priority = 4, description = "Checking the display of the expiration date field Year")
    private void test_FPay_3_fieldYear() {
        PayFormPage pfp = new PayFormPage(Driver.getDriver());
        Assert.assertTrue(pfp.fieldEnterYear(), "FAIL: Field Enter Year NOT is displayed");
    }
    @Test(priority = 5, description = "Checking the display of the CVC field")
    private void test_FPay_4(){
        PayFormPage pfp = new PayFormPage(Driver.getDriver());
        Assert.assertTrue(pfp.fieldEnterCVC(), "FAIl: Field Enter CVC NOT is displayed");
    }
    @Test(priority = 6, description = "Checking the display of the checkbox 'Save card for purchase'")
    private void test_FPay_5(){
        PayFormPage pfp = new PayFormPage(Driver.getDriver());
        Assert.assertTrue(pfp.checkboxIsDisplayed(), "FAIL: checkbox not showing");
    }
    @Test(priority = 7,description = "Checking the display of the payment button")
    private void test_FPay_6(){
        PayFormPage pfp = new PayFormPage(Driver.getDriver());
        Assert.assertTrue(pfp.buttonPayIsDisplayed(), "FAIL: Button NOT is displayed");
    }
    @Test(priority = 8, description = "Modal window size check")
    private void test_FPay_7_modalSize(){
        PayFormPage pfp = new PayFormPage(Driver.getDriver());
        String modalWindowSize = pfp.getModalWindowSize();
        Assert.assertEquals(modalWindowSize, "675x495",
                "FAIL: The modal size does not match the expected value");
    }@Test(priority = 8, description = "Modal window size check - Negative")
    private void test_FPay_7_modalSize_Negative(){
        PayFormPage pfp = new PayFormPage(Driver.getDriver());
        String modalWindowSize = pfp.getModalWindowSize();
        Assert.assertNotEquals(modalWindowSize, "800x900",
                "FAIL: The modal size does not match the expected value");
    }
    @Test(priority = 9, description = "Modal window background check")
    private void test_FPay_7_modalBackgroundColor() {
        PayFormPage pfp = new PayFormPage(Driver.getDriver());
        String backgroundColor = pfp.getModalWindowBackgroundColor();
        Assert.assertEquals(backgroundColor, "rgba(246, 224, 224, 1)",
                "The background color of the modal does not match the expected value");
    }
    @Test(priority = 10, description = "Modal box shadow check")
    private void test_FPay_7_modalWindowShadow() {
        PayFormPage pfp = new PayFormPage(Driver.getDriver());
        Assert.assertTrue(pfp.isModalWindowShadowPresent(),
                "The modal window has no shadow, although it was expected to have a shadow");
    }

}
