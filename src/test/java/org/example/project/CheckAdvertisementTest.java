package org.example.project;

import io.qameta.allure.Description;
import io.qameta.allure.Link;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class CheckAdvertisementTest extends AbstractTest {
    static Logger logger = LoggerFactory.getLogger(CheckAdvertisementTest.class);

    @Test
    @Description("Тест№-6")
    @Link("https://docs.google.com/spreadsheets/d/1pU6RNbozjgsYM8avHWatyWXGjCkArIAgTd6THo0cSb4/edit?usp=sharing")
    @Severity(SeverityLevel.NORMAL)
    void checkAdvertisement() throws IOException {
        try {
            Locators locators = new Locators(getDriver());

            locators.clickBanner();

            Thread.sleep(1000l);
        } catch (Exception exception) {
            File file = MyUtils.makeScreenshot(getDriver(), "failure- org.example.project test№6- False" + System.currentTimeMillis() + ".png");
            MyUtils.saveScreenshot(Files.readAllBytes(file.toPath()));
        }
        Assertions.assertEquals(getDriver().getCurrentUrl(), "https://www.wildberries.ru/");
        logger.info("Passed");
    }
}
