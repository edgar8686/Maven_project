package org.example.lesson3;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CheckPhotoTest {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");

        WebDriver driver = new FirefoxDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("http://automationpractice.com/index.php");

        WebElement moreElement = driver.findElement(By.cssSelector("#homefeatured > .ajax_block_product:nth-child(1) .button:nth-child(2) > span"));
        //WebElement webElement3 = driver.findElement(By.xpath(".//ul[@id='homefeatured']//li[@class='ajax_block_product col-xs-12 col-sm-4 col-md-3 first-in-line first-item-of-table-line first-item-of-mobile-line']//span[contains(text(),'More')]"));
        //WebElement webElement4 = driver.findElement(By.xpath("(//span[contains(text(),'More')])[1]"));
        //WebElement webElement5 = driver.findElement(By.xpath("//ul[@id='homefeatured']/li/div/div[2]/div[2]/a[2]/span"));
        List<WebElement> webElements = driver.findElements(By.cssSelector("#homefeatured > .ajax_block_product:nth-child(1) .button:nth-child(2) > span"));
        if (webElements.size() > 1) {
            System.out.println(webElements.size());
        }
        moreElement.click();

        WebElement viewElement = driver.findElement(By.xpath(".//span[@class='span_link no-print']"));

        webElements = driver.findElements(By.xpath(".//span[@class='span_link no-print']"));
        if (webElements.size() > 1) {
            System.out.println(webElements.size());
        }
        viewElement.click();
        driver.quit();
    }
}




