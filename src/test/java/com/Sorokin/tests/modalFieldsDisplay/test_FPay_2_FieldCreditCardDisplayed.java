package com.Sorokin.tests.modalFieldsDisplay;

import com.Sorokin.pages.PayFormPage;
import com.Sorokin.utilites.Driver;
import com.Sorokin.utilites.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test_FPay_2_FieldCreditCardDisplayed extends TestBase {
    @Test(description = "Отображение поля номера каты")
    private void test_FPay_2(){
        PayFormPage pfp = new PayFormPage(Driver.getDriver());
        Assert.assertTrue(pfp.fieldNameIsDisplay(), "False: NamePage is displayed");

    }

}
