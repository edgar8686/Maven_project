package org.example.lesson6;

import org.example.lesson7.Locators;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AddProductTest extends AbstractTest {
    static Logger logger = LoggerFactory.getLogger(AddProductTest.class);
    @Test
    void addProduct() throws InterruptedException {
        Locators locators = new Locators(getDriver());

        locators.toScroll("0,839");

        locators.clickHoverCursor();

        Thread.sleep(1000);

        locators.clickBasket();

        Assertions.assertTrue(getDriver().getCurrentUrl().endsWith("/detail.aspx?targetUrl=MI"));
        logger.info("Тест пройден");
    }
}
