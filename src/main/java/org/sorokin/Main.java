package org.sorokin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://test-stand.gb.ru/seminar_stands/payform/index.html");
//        String title = driver.getTitle();
//        System.out.println(title);
        WebElement textBox = driver.findElement(By.xpath("//input[@name='cc_number']"));
        textBox.sendKeys("62");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5500));


//        driver.quit();



    }
}