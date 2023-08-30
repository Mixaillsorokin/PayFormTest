package com.Sorokin.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PayFormPage {

    WebDriver driver;

    @FindBy(xpath = ".//div[@class='modal']")
    public WebElement modalWindowShadow;
    @FindBy(xpath = ".//*[@class='modal__container']")
    public WebElement modalWindow;
    @FindBy(xpath = ".//input[@class='form__input']")
    public WebElement fieldName;
    @FindBy(xpath = ".//input[@name='cc_number']")
    public WebElement inputFieldCreditCard;
    @FindBy(xpath = ".//input[@name='cc_number']/..")
    public WebElement inputFieldCreditCardIcon;
    @FindBy(name = "cc_month")
    public WebElement inputFieldExpiryDateMonth;
    @FindBy(name = "cc_year")
    public WebElement inputFieldExpirationDateYear;
    @FindBy(xpath = ".//input[@name='cc_cvc']")
    public WebElement InputFieldExpiryDateCVC;
    @FindBy(xpath = ".//input[@type='checkbox']")
    public WebElement CheckboxSaveCardForShopping;
    @FindBy(className = "button")
    public WebElement buttonPay;
    @FindBy(xpath = ".//*[@class='creditcard-icon creditcard-icon--visa']")
    public WebElement visaIcon;


    public PayFormPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean fieldNameIsDisplay() {
        return fieldName.isDisplayed();
    }

    public boolean fieldEnterCreditCard() {
        return inputFieldCreditCard.isDisplayed();
    }

    public boolean fieldEnterMonth() {
        return inputFieldExpiryDateMonth.isDisplayed();
    }

    public boolean fieldEnterYear() {
        return inputFieldExpirationDateYear.isDisplayed();
    }

    public boolean fieldEnterCVC() {
        return InputFieldExpiryDateCVC.isDisplayed();
    }

    public boolean checkboxIsDisplayed() {
        return CheckboxSaveCardForShopping.isDisplayed();
    }

    public boolean buttonPayIsDisplayed() {
        return buttonPay.isDisplayed();
    }

    public boolean areOnlyDigitsEntered() {
        return InputFieldExpiryDateCVC.getAttribute("value").matches("\\d+");
    }



    public String getModalWindowSize() {
        int width = modalWindow.getSize().getWidth();
        int height = modalWindow.getSize().getHeight();
        return width + "x" + height;
    }


    public String getModalWindowBackgroundColor() {
        return modalWindow.getCssValue("background-color");
    }



    public boolean isModalWindowShadowPresent() {
        String boxShadow = modalWindowShadow.getCssValue("box-shadow");
        return !boxShadow.isEmpty();
    }


    public void enterName(String text) {
        fieldName.sendKeys(text);
    }
    public String enterCreditCardNum(String num) {
         inputFieldCreditCard.sendKeys(num);
        return num;
    }
    public void deleteCreditCardNum() {
        inputFieldCreditCard.clear();
    }

    public void enterFieldCVC(String num) {
        InputFieldExpiryDateCVC.sendKeys(num);
    }

    public void enterFieldMonth(String num){
        inputFieldExpiryDateMonth.sendKeys(num);
    }

    public void enterFieldYer(String num){
        inputFieldExpirationDateYear.sendKeys(num);
    }

    public String getNameInputPlaceholderText(String name) {
        String placeholderText = fieldName.getAttribute(name);
        return placeholderText;
    }
    public String getAttributeCC(String name) {
        String placeholderText = inputFieldCreditCardIcon.getAttribute(name);
        return placeholderText;
    }


    public boolean isPlaceholderHidden(String name) {
        String placeholder = fieldName.getAttribute(name);
        return placeholder == null || placeholder.isEmpty();
    }



    public boolean isNameFieldRed() {
        String borderColor = fieldName.getCssValue("border-color");
        return borderColor.contains("rgba"); // RGB для красного цвета
    }


    public boolean isCrossIconDisplayed() {
        WebElement crossIcon = driver.findElement(By.id("crossIcon"));
        return crossIcon.isDisplayed();
    }



    public boolean isNameFieldGreen() {
        String borderColor = fieldName.getCssValue("border-color");
        return borderColor.contains("rgb(0, 128, 0)"); // RGB для зеленого цвета
    }


    public boolean isGreenCheckmarkDisplayed() {
        WebElement greenCheckmark = driver.findElement(By.id("greenCheckmark"));
        return greenCheckmark.isDisplayed();
    }


    public void clickPayButton() {
        buttonPay.click();
    }
    public void clickFieldName() {
        fieldName.click();
    }

    public boolean isTooltipDisplayed() {
        WebElement tooltip = driver.findElement(By.id("tooltip"));
        return tooltip.isDisplayed();
    }

    public boolean isVisaIconDisplayed() {
        return visaIcon.isDisplayed();
    }


    public int getInputFieldLength() {
        String fieldValue = InputFieldExpiryDateCVC.getAttribute("maxlength");
        return fieldValue.length();
    }
    public int getInputFieldLengthMonth() {
        String fieldValue = inputFieldExpiryDateMonth.getAttribute("maxlength");
        return fieldValue.length();
    }
    public int getInputFieldLengthYear() {
        String fieldValue = inputFieldExpirationDateYear.getAttribute("maxlength");
        return fieldValue.length();
    }

    public boolean areNumbersInRange(String text) {
        try {
            int number = Integer.parseInt(text);
            return number >= 1 && number <= 999;
        } catch (NumberFormatException e) {
            return false;
        }
    }


    public String formatNumber(int number) {
        return String.format("%03d", number);
    }
    public String getButtonColor() {
        fieldName.clear();
        return buttonPay.getCssValue("background-color");
    }

    public String getPayButtonText() {
        return buttonPay.getText();
    }


    public void hoverOverZoomButton() {
        Actions actions = new Actions(driver);
        actions.moveToElement(buttonPay).perform();
    }
    public int getZoomButtonWidth() {
        return buttonPay.getSize().getWidth();
    }
    public boolean areMonthAndYearRequired() {
        return inputFieldExpiryDateMonth.getAttribute("required") != null &&
                inputFieldExpirationDateYear.getAttribute("required") != null;
    }
    public void hoverOverMonthField() {
        Actions actions = new Actions(driver);
        actions.moveToElement(inputFieldExpiryDateMonth).perform();
    }

    public void hoverOverYearField() {
        Actions actions = new Actions(driver);
        actions.moveToElement(inputFieldExpirationDateYear).perform();
    }

    public String getMonthFieldTextColor() {
        return inputFieldExpiryDateMonth.getCssValue("color");
    }

    public String getYearFieldTextColor() {
        return inputFieldExpirationDateYear.getCssValue("color");
    }


    public boolean isCheckboxSelected() {
        return CheckboxSaveCardForShopping.isEnabled();
    }
    public boolean checkboxIsActive() {
        boolean isDisplayed = CheckboxSaveCardForShopping.isDisplayed();
        if (isDisplayed = true) {
            CheckboxSaveCardForShopping.click();
        }
        return true;
    }

    public boolean enterCreditCardNumber(String cardNumber) {
        inputFieldCreditCard.clear();
        inputFieldCreditCard.sendKeys(cardNumber);
        String inputText = inputFieldCreditCard.getAttribute("value");
        return inputText.equals(cardNumber);
    }

    public boolean enterMonth(String month) {
        inputFieldExpiryDateMonth.clear();
        inputFieldExpiryDateMonth.sendKeys(month);
        String inputText = inputFieldExpiryDateMonth.getAttribute("value");
        return inputText.equals(month);
    }

    public boolean enterYear(String year) {
        inputFieldExpirationDateYear.clear();
        inputFieldExpirationDateYear.sendKeys(year);
        String inputText = inputFieldExpiryDateMonth.getAttribute("value");
        return inputText.equals(year);
    }
}


