package com.Sorokin.tests.modalFieldsDisplay;

import com.Sorokin.pages.PayFormPage;
import com.Sorokin.utilites.Driver;
import com.Sorokin.utilites.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test_FPay_7_SizeModalWindow extends TestBase {
    @Test(description = "Размер модального окна 800х900,фон - розовый, есть тень")
    private void test_FPay_7(){
        PayFormPage pfp = new PayFormPage(Driver.getDriver());
        Assert.assertTrue(pfp.fieldNameIsDisplay(), "False: NamePage is displayed");

    }

}
