package com.Sorokin.tests.typeCreditCard;

import com.Sorokin.pages.PayFormPage;
import com.Sorokin.utilites.Driver;
import org.testng.annotations.Test;

public class test_FPay_24_InputNumberCardValid {
    @Test(description = "Ввод валидного номера карты (от 12 до 19 символов в зависимости от платежной системы карты, только цифры")
    private void test_FPay_24() {
        PayFormPage pfp = new PayFormPage(Driver.getDriver());
    }
}
