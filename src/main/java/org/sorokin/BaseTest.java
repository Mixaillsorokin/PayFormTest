package org.sorokin;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

    public class BaseTest {
        public static void main(String[] args) throws InterruptedException {

            // Инициализация экземпляра браузера Chrome
            WebDriver driver = new ChromeDriver();

            // Открыть веб-страницу с полем ввода номера карты
            driver.get("https://test-stand.gb.ru/seminar_stands/payform/index.html");

            // Найти поле ввода номера карты по селектору
            WebElement cardNumberField = driver.findElement(By.xpath("//input[@name='cc_number']"));

            // Ввести число 4 в поле ввода номера карты
            cardNumberField.sendKeys("4");

            // Пауза для обработки событий на странице
            Thread.sleep(2000);

            // Найти элемент с иконкой VISA по селектору
            WebElement visaIcon = driver.findElement(By.cssSelector(".creditcard-icon"));

            // Проверить, что иконка VISA отображается
            if (visaIcon.isDisplayed()) {
                System.out.println("Иконка VISA отображается при вводе числа 4 в поле номера карты");
            } else {
                System.out.println("Иконка VISA НЕ отображается при вводе числа 4 в поле номера карты");
            }

            // Закрыть браузер Chrome
            driver.quit();
        }
    }
//```
//
//    В этом примере мы используем Selenium WebDriver для автоматизации
//    действий в браузере Chrome. Замените `"ПУТЬ_К_ДРАЙВЕРУ_CHROME"` на
//    фактический путь к драйверу Chrome на вашем компьютере. Также замените
//    `"URL_ВЕБ-СТРАНИЦЫ"` на фактический URL веб-страницы, которую вы хотите
//    протестировать, и `"СЕЛЕКТОР_ПОЛЯ_ВВОДА_НОМЕРА_КАРТЫ"` на селектор, чтобы
//    найти поле ввода номера карты, и `"СЕЛЕКТОР_ИКОНКИ_VISA"` на селектор, чтобы
//    найти иконку VISA на странице.
//
//    Мы вводим число 4 в поле ввода номера карты, и затем находим элемент с иконкой
//    VISA и проверяем его видимость. Если иконка VISA отображается, выводится сообщение
//    "Иконка VISA отображается при вводе числа 4 в поле номера карты". Если иконка
//    VISA не отображается, выводится сообщение "Иконка VISA НЕ отображается при вводе
//    числа 4 в поле номера карты".


