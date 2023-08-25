package com.Sorokin.tests.typeCreditCard;

import com.Sorokin.pages.PayFormPage;
import com.Sorokin.utilites.Driver;
import org.testng.annotations.Test;

public class test_FPay_20_UNIONPAYCard {
    @Test(description = "Определение карты UNIONPAY и отображение иконки при вводе  62")
    private void test_FPay_20() {
        PayFormPage pfp = new PayFormPage(Driver.getDriver());
    }
}
