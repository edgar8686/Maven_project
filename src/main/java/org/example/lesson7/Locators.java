package org.example.lesson7;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Locators extends AbstractPage {

    @FindBy(css = ".goods__list:nth-child(5) > .goods__item:nth-child(3) .goods-card__price")
    private WebElement cursor;
    @FindBy(xpath = "//button[contains(.,'В корзину')]")
    private WebElement basket;
    @FindBy(name = "banner_82b41cbe-c824-4c56-899f-1ed1dc411a1c")
    private WebElement banner;
    @FindBy(css = ".nav-element__burger-line")
    private WebElement elementBurger;
    @FindBy(css = ".menu-burger__main-list-link--629")
    private WebElement menuBurger;
    @FindBy(linkText = "О нас")
    private WebElement info;
    @FindBy(css = ".j-image-canvas")
    private WebElement photo;
    @FindBy(id = "searchInput")
    private WebElement search;


    public Locators(WebDriver driver) {
        super(driver);
    }
    public Locators clickHoverCursor() {
        cursor.click();
        return this;
    }
    public Locators clickBasket() {
        basket.click();
        return this;
    }
    public Locators clickBanner() {
        banner.click();
        return this;
    }
    public Locators clickElementBurger() {
        elementBurger.click();
        return this;
    }
    public Locators clickMenuBurger() {
        menuBurger.click();
        return this;
    }
    public Locators cliclInfo() {
        info.click();
        return this;
    }
    public Locators clickPhoto() {
        photo.click();
        return this;
    }
    public void toSearch(String value) {
        new WebDriverWait(getDriver(), 5).until(ExpectedConditions.elementToBeClickable(search));
        search.click();
        search.sendKeys(value, Keys.RETURN);
    }
}
