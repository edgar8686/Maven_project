package org.example.lesson6;

import org.example.lesson7.Locators;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CheckInfoTest extends AbstractTest {
    static Logger logger = LoggerFactory.getLogger(CheckInfoTest.class);
    @Test
    void CheckInfoTest() throws InterruptedException {
        Locators locators = new Locators(getDriver());

        JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
        long windowWidth = (long) jsExecutor.executeScript("return window.innerWidth");
        System.out.println("Размер окна " + windowWidth);
        jsExecutor.executeScript("window.scrollBy(0,3000.2000122070312)");

        locators.cliclInfo();

        Thread.sleep(2000l);

        Assertions.assertEquals(getDriver().getTitle(), "Wildberries - модный интернет магазин");
        logger.info("Тест пройден");

    }
}
