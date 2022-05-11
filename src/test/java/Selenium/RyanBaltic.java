package Selenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RyanBaltic {
    private final String HOME_PAGE_URL = "http://www.qaguru.lv:8089/tickets/step2.php?afrom=CPT&bfrom=BCN";
    private final By NAME_FIELD = By.id("name");
    private final By SURNAME_FIELD = By.id("surname");
    private final By DISCOUNT_CODE_FIELD = By.id("discount");
    private final By PASSENGER_COUNT = By.id("adults");
    private final By CHILDREN_COUNT = By.id("children");
    private final By LUGGAGE_COUNT = By.id("bugs");
    private final By SELECT_FLIGHT = By.id("flight");
    private final By SELECT_DATE = By.xpath(".//option[@value = 11]");
    private final By GET_PRICE_CLICK = By.xpath(".//span[contains (@onclick, 'setLang')]");





    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Test
    public void searchFieldCheck() {
        System.setProperty("webdriver.chrome.driver", "/Users/marjanaandrishko/Desktop/QA Guru info/chromedriver");
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get(HOME_PAGE_URL);

        WebElement nameField = browser.findElement(NAME_FIELD);
        nameField.sendKeys(" Marjana ");
        nameField.sendKeys(Keys.ENTER);

        WebElement surnameField = browser.findElement(SURNAME_FIELD);
        surnameField.sendKeys(" Andrisko ");
        surnameField.sendKeys(Keys.ENTER);

        WebElement discountField = browser.findElement(DISCOUNT_CODE_FIELD);
        discountField.sendKeys(" ABCDS ");
        discountField.sendKeys(Keys.ENTER);


        WebElement countField = browser.findElement(PASSENGER_COUNT);
        countField.sendKeys(" 2 ");
        countField.sendKeys(Keys.ENTER);

        WebElement childField = browser.findElement(CHILDREN_COUNT);
        childField.sendKeys(" 2 ");
        childField.sendKeys(Keys.ENTER);

        WebElement luggageField = browser.findElement(LUGGAGE_COUNT);
        luggageField.sendKeys(" 3 ");
        luggageField.sendKeys(Keys.ENTER);

        WebElement flightField = browser.findElement(SELECT_FLIGHT);
        flightField.click();

        WebElement dateField = browser.findElement(SELECT_DATE);
        dateField.click();
        dateField.isSelected();

        WebElement getPriceField = browser.findElement(GET_PRICE_CLICK);
        getPriceField.click();







    }
}