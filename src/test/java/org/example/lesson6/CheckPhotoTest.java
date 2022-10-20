package org.example.lesson6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CheckPhotoTest extends AbstractTest {
    static Logger logger = LoggerFactory.getLogger(CheckPhotoTest.class);

    @Test
    void checkPhoto() throws InterruptedException {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
        long windowWidth = (long) jsExecutor.executeScript("return window.innerWidth");
        System.out.println("Размер окна " + windowWidth);
        jsExecutor.executeScript("window.scrollBy(0,839.199951171875)");

        WebElement hoverCursor = getDriver().findElement(By.cssSelector(".goods__list:nth-child(5) > .goods__item:nth-child(3) .goods-card__price"));
        hoverCursor.click();

        Thread.sleep(1000);
        JavascriptExecutor jsExecutor1 = (JavascriptExecutor) getDriver();
        long windowWidth1 = (long) jsExecutor1.executeScript("return window.innerWidth");
        System.out.println("Размер окна " + windowWidth1);
        jsExecutor1.executeScript("window.scrollBy(0,0)");

        WebElement clickPhoto = getDriver().findElement(By.cssSelector(".j-image-canvas"));
        clickPhoto.click();

        Assertions.assertTrue(getDriver().getCurrentUrl().endsWith("/detail.aspx?targetUrl=MI"));
        logger.info("Тест пройден");
    }
}
