package org.example.lesson6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CheckInfoTest extends AbstractTest {

    static Logger logger = LoggerFactory.getLogger(CheckInfoTest.class);

    @Test
    void CheckInfoTest() throws InterruptedException {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
        long windowWidth = (long) jsExecutor.executeScript("return window.innerWidth");
        System.out.println("Размер окна " + windowWidth);
        jsExecutor.executeScript("window.scrollBy(0,3000.2000122070312)");

        Thread.sleep(1000l);
        WebElement clickInfo = getDriver().findElement(By.linkText("О нас"));
        clickInfo.click();

        Assertions.assertEquals(getDriver().getTitle(), "Wildberries - модный интернет магазин");
        logger.info("Тест пройден");

    }
}
