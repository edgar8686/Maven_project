package org.example.lesson6;

import org.example.lesson7.Locators;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CheckSearchTest extends AbstractTest {
    static Logger logger = LoggerFactory.getLogger(CheckSearchTest.class);
    @Test
    void checkSearchTest() throws InterruptedException {
        Locators locators = new Locators(getDriver());

        locators.toSearch("телефон");
        Thread.sleep(1000l);

        Assertions.assertEquals(getDriver().getTitle(), "Wildberries - модный интернет магазин");
        logger.info("Тест пройден");
    }
}
