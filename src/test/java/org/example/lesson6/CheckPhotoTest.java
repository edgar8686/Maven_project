package org.example.lesson6;

import org.example.lesson7.Locators;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CheckPhotoTest extends AbstractTest {
    static Logger logger = LoggerFactory.getLogger(CheckPhotoTest.class);
    @Test
    void checkPhoto() throws InterruptedException {
        Locators locators = new Locators(getDriver());

        locators.toScroll("0,839");

        locators.clickHoverCursor();

        Thread.sleep(2000l);

        locators.clickPhoto();

        Assertions.assertTrue(getDriver().getCurrentUrl().endsWith("/detail.aspx?targetUrl=MI"));
        logger.info("Тест пройден");
    }
}
