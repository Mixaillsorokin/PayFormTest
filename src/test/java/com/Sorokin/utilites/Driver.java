package com.Sorokin.utilites;
import io.github.bonigarcia.wdm.WebDriverManager;;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;




public class Driver {
    public static WebDriver driver;

    private Driver() {
    }

    public static WebDriver getDriver() {
        String browser = ConfigReader.getProperty("browser");
        if (driver == null) {
            switch (browser) {
                case "chrome":
                    ;
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    ;
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                default:
                    throw new RuntimeException("Wrong browser name");
            }
        }
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
