package com.Sorokin.tests.fieldInputName;

import com.Sorokin.pages.PayFormPage;
import com.Sorokin.utilites.Driver;
import com.Sorokin.utilites.TestBase;
import org.testng.annotations.Test;


public class test_FPay_13_InputNameValid extends TestBase {
    @Test(description = "Ввод валидного имени (от 3 до 40 символов, латиница, буквы, тире, пробелы)")
    private void test_FPAY_13(){
        PayFormPage pfp = new PayFormPage(Driver.getDriver());
        pfp.enterName("01");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}

