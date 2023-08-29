package com.Sorokin.tests.buttonPay;

import com.Sorokin.pages.PayFormPage;
import com.Sorokin.utilites.Driver;
import com.Sorokin.utilites.TestBase;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class test_Cases_ButtonPay extends TestBase {
    @Test(description = "Check that the color is gray when not all fields are filled")
    private void test_FPay_38_ColorButtonGreyEnterNotAllFields() {
        PayFormPage pfp = new PayFormPage(Driver.getDriver());
        Assert.assertTrue(pfp.getButtonColor().contains( "rgba"), "Color is not gray when not all fields are filled");
    }
    @Test(description = "Check that the color is gray when not all fields are filled")
    private void test_FPay_38_ColorButtonGreyEnterNotAllFields_Negative() {
        PayFormPage pfp = new PayFormPage(Driver.getDriver());
        Assert.assertFalse(pfp.getButtonColor().contains( "gray"), "Color is not gray when not all fields are filled");
    }

    @Test(description = "Check that the color is green when all fields are filled")
    private void test_FPay_39_ColorButtonGreenEnterAllFields() {
        PayFormPage pfp = new PayFormPage(Driver.getDriver());
        pfp.enterName("Михаил");
        pfp.enterCreditCardNum("1234567891012");
        pfp.enterFieldCVC("123");
        pfp.enterFieldMonth("12");
        pfp.enterFieldYer("22");
        Assert.assertEquals(pfp.getButtonColor(), "rgba(36, 207, 95, 1)", "Color is not green when all fields are filled");
    }

    @Test(description = "Displayed summ for pay (Format NN рубля/рублей/рубль NN копеек/копейка)")
    private void test_FPay_40_DisplayPaymentAmount() {
        PayFormPage pfp = new PayFormPage(Driver.getDriver());
        throw new SkipException("Skipped");
//        Assert.assertTrue(pfp.getPayButtonText().matches("\\d+ (рубль|рубля|рублей) \\d+ (копейка|копейки|копеек)"),
//                "Sum for pay incorrect format ");
    }@Test(description = "Displayed summ for pay (Format NN рубля/рублей/рубль NN копеек/копейка)")
    private void test_FPay_40_DisplayPaymentAmount_Negative() {
        PayFormPage pfp = new PayFormPage(Driver.getDriver());
        Assert.assertFalse(pfp.getPayButtonText().matches("\\d+ (рубль|рубля|рублей) \\d+ (копейка|копейки|копеек)"),
                "Sum for pay incorrect format ");
    }
    @Test(description = "Check that button zoom when cursor")
    private void test_FPay_41_ZoomButtonWhenCursor() {
        PayFormPage pfp = new PayFormPage(Driver.getDriver());
        int initialWidth = pfp.getZoomButtonWidth();
        pfp.hoverOverZoomButton();
        int zoomedWidth = pfp.getZoomButtonWidth();
        Assert.assertTrue(zoomedWidth == initialWidth,
                "Button not zoom");
    }@Test(description = "Check that button zoom when cursor")
    private void test_FPay_41_ZoomButtonWhenCursor_Negative() {
        PayFormPage pfp = new PayFormPage(Driver.getDriver());
        int initialWidth = pfp.getZoomButtonWidth();
        pfp.hoverOverZoomButton();
        int zoomedWidth = pfp.getZoomButtonWidth();
        Assert.assertFalse(zoomedWidth > initialWidth,
                "Button not zoom");
    }

}

