package org.example.lesson6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

public class CheckSearchTest extends AbstractTest {

    static Logger logger = LoggerFactory.getLogger(CheckSearchTest.class);

    @Test
    void checkSearchTest() {
        new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("https://www.wildberries.ru"));

        Actions search = new Actions(getDriver());

        search.sendKeys(getDriver().findElement(By.id("searchInput")), "телефон")
                .pause(1000l)
                .sendKeys(Keys.RETURN)
                .build()
                .perform();

        Assertions.assertEquals(getDriver().getTitle(), "Wildberries - модный интернет магазин");
        logger.info("Тест пройден");

    }
}
