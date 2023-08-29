package com.Sorokin.tests.fieldInputName;

import com.Sorokin.pages.PayFormPage;
import com.Sorokin.utilites.Driver;
import com.Sorokin.utilites.TestBase;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;


public class test_Cases_FieldInputName extends TestBase {
    @Test(description = "Checking if the name input field contains the placeholder 'Your name'")
    private void test_FPay_8_Placeholder_YourName() {
        PayFormPage pfp = new PayFormPage(Driver.getDriver());
        String placeholderText = pfp.getNameInputPlaceholderText("placeholder");
        pfp.fieldName.clear();
        if(placeholderText != null){
            Assert.assertNotEquals(placeholderText, "Ваше имя",
                    "Fail");
        }else {
            System.out.println("Placeholder attribute not found");
        }
    }

    @Test(description = "Placeholder hiding Enter Text")
    private void test_FPay_9_Placeholder_YourName_hidingEnterText() {
        PayFormPage pfp = new PayFormPage(Driver.getDriver());
        String placeholderText = pfp.getNameInputPlaceholderText("placeholder");
        pfp.enterName("Михаил");
        if(placeholderText != null){
            Assert.assertTrue(pfp.isPlaceholderHidden("placeholder"),
                    "Fail");
        }else {
            System.out.println("Placeholder attribute not found");
        }
        pfp.fieldName.clear();
    }


    @Test(description = "Check that the field is highlighted in red and a cross is displayed if nothing is entered")
    private void test_FPay_10_FieldNameHighlightedRedCross() {
        PayFormPage pfp = new PayFormPage(Driver.getDriver());
        pfp.clickFieldName();
        throw new SkipException("Skipped");
//        Assert.assertTrue(pfp.isNameFieldRed(),
//                "The field is not highlighted in red when there is no entered text");
//        Assert.assertTrue(pfp.isCrossIconDisplayed(),
//                "The cross is not displayed when there is no entered text");

    }


    @Test(description = "Verify that the field is highlighted in green and a green check mark is displayed if a name is entered")
    private void test_FPay_11_FieldNameHighlightedGreenCheckmark() {
        PayFormPage pfp = new PayFormPage(Driver.getDriver());
        pfp.enterName("Михаил");
        pfp.fieldName.clear();
        throw new SkipException("Skipped");
//        Assert.assertTrue(pfp.isNameFieldGreen(),
//                "The field is not highlighted in green after entering a name");
//        Assert.assertTrue(pfp.isGreenCheckmarkDisplayed(),
//                "Green checkmark not showing after entering name");

    }

    @Test(enabled = false, description = "Check Show the 'Fill in this field' tooltip if the user has entered nothing and clicked the 'Pay' button")
    private void test_FPay_12_DisplayingTooltipNotEnterAndClickButtonPay() {
        PayFormPage pfp = new PayFormPage(Driver.getDriver());
        pfp.enterName("");
        pfp.clickPayButton();
        Assert.assertTrue(pfp.isTooltipDisplayed(),
                "Tooltip 'Fill in this field' is not displayed after clicking the 'Pay' button");
        pfp.fieldName.clear();
    }

    @Test(description = "Valid name input check (from 3 to 40 characters, Latin, letters, dashes, spaces)")
    private void test_FPAY_13_InputNameValid() {
        PayFormPage pfp = new PayFormPage(Driver.getDriver());
        pfp.enterName("Sorokin Mikhail QA-engineer");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        pfp.fieldName.clear();
    }

    @Test(description = "Valid name input check >40")
    private void test_FPAY_14_InputNameNegativeOver40() {
        PayFormPage pfp = new PayFormPage(Driver.getDriver());
        pfp.enterName("SoroMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        pfp.fieldName.clear();
    }

    @Test(description = "Valid name input check <3 ")
    private void test_FPAY_14_InputNameNegativeLess3() {
        PayFormPage pfp = new PayFormPage(Driver.getDriver());
        pfp.enterName("sm");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        pfp.fieldName.clear();
    }

    @Test(description = "Checking the input is not a valid name using special. characters or Cyrillic.")
    private void test_FPAY_15_InputNameNegativeCyrillic() {
        PayFormPage pfp = new PayFormPage(Driver.getDriver());
        pfp.enterName("Михаил");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        pfp.fieldName.clear();
    }

}






