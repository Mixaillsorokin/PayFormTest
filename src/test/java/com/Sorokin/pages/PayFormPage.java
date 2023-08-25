package com.Sorokin.pages;

import com.Sorokin.utilites.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PayFormPage {

    WebDriver driver;

    @FindBy(xpath = "//h2")
    public WebElement namePageFormPay;
//    public By namePageFormPay = By.xpath("//h2[text()=‘Страница оплаты товара’]");
    @FindBy(xpath = "//input[@class='form__input']")
    public WebElement enterFieldName;
//    public By enterFieldName = By.xpath("//input[@class='form__input']");
    @FindBy(xpath = ".//label[text()='Номер карты']")
    public WebElement nameInputFieldCreditCard;
    @FindBy(xpath = "//input[@name='cc_number']")
    public WebElement inputFieldCreditCard;
    @FindBy(xpath = ".//label[text()='Срок годности']")
    public WebElement NameExpirationDate;
    @FindBy(name = "cc_month")
    public WebElement inputFieldExpiryDateMonth
            ;
    @FindBy(name = "cc_year")
    public WebElement inputFieldExpirationDateYear;
    @FindBy(xpath = "//label[contains(text(), 'CVC')]")
    public WebElement nameInputFieldExpiryDateCVC;
    @FindBy(name = "cc_cvc")
    public WebElement InputFieldExpiryDateCVC;
    @FindBy(xpath = "&&&&&&&&&&&&&&&&&&&&&&&&22uioihrwe")
    public WebElement nameCheckboxSaveCardForShopping;
    @FindBy(name = "save_cc")
    public WebElement SelectCheckboxSaveCardForShopping;
    @FindBy(className = "button")
    public WebElement NameButtonPay;

    public PayFormPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean fieldNameIsDisplay() {
        return namePageFormPay.isDisplayed();

    }
    public void enterName(String text) {
        enterFieldName.sendKeys(text);
    }
}
