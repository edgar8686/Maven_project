package org.example.lesson6;

import org.example.lesson7.Locators;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CheckAdvertisementTest extends AbstractTest {
    static Logger logger = LoggerFactory.getLogger(CheckAdvertisementTest.class);

    @Test
    void checkAdvertisement() throws InterruptedException {
        Locators locators = new Locators(getDriver());

        locators
                .clickBanner();

        Thread.sleep(1000l);

        Assertions.assertEquals(getDriver().getTitle(), "Хэллоуин распродажа в интернет-магазине Wildberries");
        logger.info("Тест пройден");
    }
}
