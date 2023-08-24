package com.Sorokin.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PayFormPage {

    public WebDriver driver;
    @FindBy(xpath = "/html/body/div/div/div[2]/h2")
    public WebElement namePageFormPay;
    @FindBy(xpath = "//input[@class='form__input']")
    public WebElement enterFieldName;
    @FindBy(xpath = "/html/body/div/div/div[2]/form/ul/li[2]/label")
    public WebElement nameNumberCard;
    @FindBy(xpath = "//input[@name='cc_number']")
    public WebElement enterFieldCreditCard;
    @FindBy(xpath = "/html/body/div/div/div[2]/form/ul/li[3]/div[1]/label")
    public WebElement NameExpirationDate;
    @FindBy(name = "cc_month")
    public WebElement inputFieldExpiryDateMonth
            ;
    @FindBy(name = "cc_year")
    public WebElement ПолеВводаСрокГодностиГод;
    @FindBy(xpath = "/html/body/div/div/div[2]/form/ul/li[3]/div[2]/label/text()")
    public WebElement НазваниеПолеВводаСрокГодностиCVC;
    @FindBy(name = "cc_cvc")
    public WebElement ПолеВводаСрокГодностиCVC;
    @FindBy(xpath = "/html/body/div/div/div[2]/form/ul/li[4]/label/text()")
    public WebElement НазваниеCheckboxСохранитьКартуДляПокупок;
    @FindBy(name = "save_cc")
    public WebElement CheckboxСохранитьКартуДляПокупок;
    @FindBy(className = "button")
    public WebElement НазваниеКнопкаОплатить;

    public PayFormPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public void enterName(String text) {


        if (this.enterFieldCreditCard != null) {
            this.enterFieldCreditCard.sendKeys(text);
            System.out.println("Все супер");
        } else {
            System.out.println("Элемент не был найден.");


        }
    }
}