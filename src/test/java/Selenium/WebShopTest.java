package Selenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebShopTest {
    private final String HOME_PAGE_URL = "http://1a.lv";
    private final By SEARCH_INPUT_FIELD = By.id("q");
    private final By PRODUCT_TYPE = By.xpath(".//span[@class = 'single-title']");
    private final By MENU_ITEMS = By.xpath(".//li[contains(@class, 'submenu-lvl1__list-item ')]");
    private final By MAIN_LOGO = By.xpath(".//a[@class = 'main-logo']");
    private final By MAIN_SEARCH_BUTTON = By.xpath(".//button[@class = 'main-search-submit']");
    private final By FAVORITE_ITEM_BUTTON = By.xpath(".//a[@class = 'favorite-items__handle']");
    private final By SITE_TOP_LEFT_MENU = By.xpath(".//li[@class = 'site-top__menu-left-item']");
    private final By LANGUAGE_SWITCHER = By.xpath(".//li[@class = 'site-top__menu-right-item language-switcher']/a");
    private final By ACCEPT_COOKIES = By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll");
    private final By MAIN_BANNER = By.id("welcome-carousel");

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

        WebElement searchField = browser.findElement(SEARCH_INPUT_FIELD);
        searchField.sendKeys(" Apple");
        searchField.sendKeys(Keys.ENTER);

    }

}
