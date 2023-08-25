package com.Sorokin.tests.fieldExpirationDate;

import com.Sorokin.pages.PayFormPage;
import com.Sorokin.utilites.Driver;
import org.testng.annotations.Test;

public class test_FPay_31_EnterFieldMonthLess10 {
    @Test(description = "Если месяц меньше 10, перед номером месяца необходимо добавлять 0")
    private void test_FPay_31() {
        PayFormPage pfp = new PayFormPage(Driver.getDriver());
    }
}
