package lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CheckSearchTest {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");

        WebDriver driver = new FirefoxDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("http://automationpractice.com/index.php");

        WebElement searchElement1 = driver.findElement(By.id("search_query_top"));
        List<WebElement> webElements = driver.findElements(By.id("search_query_top"));
        if (webElements.size() > 1) {
            System.out.println(webElements.size());
        }
        searchElement1.click();
        searchElement1.sendKeys("blouse");

        WebElement searchElement2 = driver.findElement(By.name("submit_search"));
        webElements = driver.findElements(By.name("submit_search"));
        if (webElements.size() > 1) {
            System.out.println(webElements.size());
        }
        searchElement2.click();
        driver.quit();
    }
}
