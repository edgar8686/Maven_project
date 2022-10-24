package org.example.lesson6;

import org.example.lesson7.Locators;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CheckCatalogTest extends AbstractTest {
    static Logger logger = LoggerFactory.getLogger(CheckCatalogTest.class);

    @Test
    void checkCatalog() throws InterruptedException {
        Locators locators = new Locators(getDriver());

        locators
                .clickElementBurger();

        Thread.sleep(2000l);

        locators
                .clickMenuBurger();

        Assertions.assertEquals(getDriver().getTitle(), "Wildberries - модный интернет магазин");
        logger.info("Тест пройден");
    }
}
