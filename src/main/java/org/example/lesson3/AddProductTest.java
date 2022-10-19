package org.example.lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AddProductTest {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");

        WebDriver driver = new FirefoxDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("http://automationpractice.com/index.php");

        WebElement addToCartElement = driver.findElement(By.cssSelector("#homefeatured > .ajax_block_product:nth-child(1) .button:nth-child(1) > span"));
        List<WebElement> webElements = driver.findElements(By.cssSelector("#homefeatured > .ajax_block_product:nth-child(1) .button:nth-child(1) > span"));
        if (webElements.size() > 1) {
            System.out.println(webElements.size());
        }
        addToCartElement.click();

        WebElement proceedToCheckoutElement = driver.findElement(By.cssSelector(".button-medium > span"));
        webElements = driver.findElements(By.cssSelector(".button-medium > span"));
        if (webElements.size() > 1) {
            System.out.println(webElements.size());
        }
        proceedToCheckoutElement.click();
        driver.quit();
    }
}
