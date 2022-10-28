package org.example.project;

import io.qameta.allure.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class AddProductTest extends AbstractTest {
    static Logger logger = LoggerFactory.getLogger(AddProductTest.class);

    @Test
    @Description("Тест№-2")
    @Link("https://docs.google.com/spreadsheets/d/1pU6RNbozjgsYM8avHWatyWXGjCkArIAgTd6THo0cSb4/edit?usp=sharing")
    @Severity(SeverityLevel.CRITICAL)
    void addProduct() throws IOException {
        try {
            Locators locators = new Locators(getDriver());

            locators.toScroll("0,839");

            locators.clickHoverCursor();

            Thread.sleep(1000);

            locators.clickBasket();
        } catch (Exception exception) {
            File file = MyUtils.makeScreenshot(getDriver(), "failure- org.example.project test№2- False" + System.currentTimeMillis() + ".png");
            MyUtils.saveScreenshot(Files.readAllBytes(file.toPath()));
        }
        Assertions.assertTrue(getDriver().getCurrentUrl().endsWith("/detail.aspx?targetUrl=MI"));
        logger.info("Passed");
    }
}


