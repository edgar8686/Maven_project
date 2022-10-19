package org.example.lesson6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

public class CheckCatalogTest extends AbstractTest {
    static Logger logger = LoggerFactory.getLogger(CheckCatalogTest.class);

    @Test
    void checkCatalog() throws InterruptedException {
        new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("https://www.wildberries.ru"));

        Actions search = new Actions(getDriver());

        search.click(getDriver().findElement(By.cssSelector(".nav-element__burger")))
                .pause(1000l)
                .click(getDriver().findElement(By.cssSelector(".menu-burger__main-list-link--629")))
                .build()
                .perform();
        Thread.sleep(1000l);

        Assertions.assertEquals(getDriver().getTitle(), "Купить обувь в интернет магазине WildBerries.ru");
        logger.info("Тест пройден");
    }
}
