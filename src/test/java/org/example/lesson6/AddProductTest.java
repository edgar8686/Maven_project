package org.example.lesson6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AddProductTest extends AbstractTest {
    static Logger logger = LoggerFactory.getLogger(AddProductTest.class);

    @Test
    void addProduct() throws InterruptedException {

        JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
        long windowWidth = (long) jsExecutor.executeScript("return window.innerWidth");
        System.out.println("Размер окна " + windowWidth);
        jsExecutor.executeScript("window.scrollBy(0,839.2000122070312)");
        Thread.sleep(1000);
        WebElement hoverCursor = getDriver().findElement(By.cssSelector(".goods__list:nth-child(5) > .goods__item:nth-child(3) .goods-card__price"));
        hoverCursor.click();

        WebElement clickBasket = getDriver().findElement(By.xpath("//button[contains(.,'В корзину')]"));
        clickBasket.click();

        Assertions.assertTrue(getDriver().getCurrentUrl().endsWith("/detail.aspx?targetUrl=MI"));
        logger.info("Тест пройден");
    }
}
