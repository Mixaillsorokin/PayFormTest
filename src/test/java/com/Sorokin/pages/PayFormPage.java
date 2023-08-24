package com.Sorokin.pages;

import com.Sorokin.utilites.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class PayFormPage {

    WebDriver driver = Driver.getDriver();
    @FindBy(xpath = "/html/body/div/div/div[2]/h2")
    public WebElement НазваниеСтраницаОплатыТовара;
    @FindBy(xpath = "//input[@class='form__input']")
    public WebElement ПолеВводаИмени;
    @FindBy(xpath = "/html/body/div/div/div[2]/form/ul/li[2]/label")
    public WebElement НазваниеНомерКарты;
    @FindBy(name = "cc_number")
    public WebElement ПолеВводаНомераКарты;
    @FindBy(xpath = "/html/body/div/div/div[2]/form/ul/li[3]/div[1]/label")
    public WebElement НазваниеСрокГодности;
    @FindBy(name = "cc_month")
    public WebElement ПолеВводаСрокГодностиМесяц;
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

//    public void PayFormPage(WebDriver driver) {
//        this.driver = driver;
//    }

    public void enterName() {
        WebElement textBox = ПолеВводаИмени;

        if (textBox != null) {
            textBox.sendKeys("ХУЮШКИ");
        } else {
            System.out.println("Элемент не был найден.");


        }
    }
}