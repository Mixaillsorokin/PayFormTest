package com.Sorokin.tests.checkbox;

import com.Sorokin.pages.PayFormPage;
import com.Sorokin.utilites.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test_Cases_Checkbox {
    @Test(skipFailedInvocations = true, description = "Card saved for purchases when Checkbox is active")
    private void test_FPay_36_CheckboxActive_Negative() {
        PayFormPage pfp = new PayFormPage(Driver.getDriver());
        pfp.checkboxIsActive();
        Assert.assertFalse(pfp.isCheckboxSelected(),"Checkbox is not selected");
    }
    @Test(skipFailedInvocations = false, description = "Card is not saved for purchases when Checkbox is not active")
    private void test_FPay_37_CheckboxNotActive_Negative() {
        PayFormPage pfp = new PayFormPage(Driver.getDriver());
        pfp.checkboxIsActive();
        Assert.assertFalse(pfp.isCheckboxSelected(),"Checkbox is selected");
    }
}
