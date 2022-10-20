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

public class CheckAdvertisementTest extends AbstractTest {
    static Logger logger = LoggerFactory.getLogger(CheckAdvertisementTest.class);

    @Test
    void checkAdvertisement() throws InterruptedException {
        new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("https://www.wildberries.ru"));

        Actions search = new Actions(getDriver());

        search.click(getDriver().findElement(By.name("banner_40695999-f5a6-4202-aa4f-52a302e42ea2")))
                .pause(1000l)
                .build()
                .perform();
        Thread.sleep(1000l);

        Assertions.assertEquals(getDriver().getTitle(), "Кофе на любой вкус в интернет-магазине Wildberries");
        logger.info("Тест пройден");
    }
}
