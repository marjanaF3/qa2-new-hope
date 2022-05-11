package Selenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumTest {
    @Test
    public void openWebPage() {
        System.setProperty("webdriver.chrome.driver", "/Users/marjanaandrishko/Desktop/QA Guru info/chromedriver");
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get("https://1a.lv");

    }
}
