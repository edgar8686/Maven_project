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

public class CheckInfoTest extends AbstractTest {
    static Logger logger = LoggerFactory.getLogger(CheckInfoTest.class);

    @Test
    @Description("Тест№-4")
    @Link("https://docs.google.com/spreadsheets/d/1pU6RNbozjgsYM8avHWatyWXGjCkArIAgTd6THo0cSb4/edit?usp=sharing")
    @Severity(SeverityLevel.NORMAL)
    void CheckInfoTest() throws IOException {
        try {
            Locators locators = new Locators(getDriver());

            locators.toScroll("0,3000");

            locators.cliclInfo();

            Thread.sleep(2000l);
        } catch (Exception exception) {
            File file = MyUtils.makeScreenshot(getDriver(), "failure- org.example.project test№4- False" + System.currentTimeMillis() + ".png");
            MyUtils.saveScreenshot(Files.readAllBytes(file.toPath()));
        }
        Assertions.assertEquals(getDriver().getTitle(), "Wildberries - модный интернет магазин");
        logger.info("Passed");

    }
}
