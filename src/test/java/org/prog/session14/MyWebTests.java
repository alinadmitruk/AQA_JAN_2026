package org.prog.session14;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class MyWebTests {
    private WebDriver driver;

    @BeforeTest
    public void setUp(){ driver = new ChromeDriver();

    }
    @AfterTest
    public void tearDown(){driver.quit();
    }

    @Test
    public void myWebTest(){
        driver.get("https://allo.ua");
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(7L));
        webDriverWait.until(
                        ExpectedConditions.elementToBeClickable(By.name("search")))
                .click();

        WebElement element = driver.findElement(By.name("search"));
        element.sendKeys("IPhone 17Pro Max");
        element.sendKeys(Keys.ENTER);
        webDriverWait.until(
                        ExpectedConditions.presenceOfElementLocated(By.cssSelector("a.product-card__title")));

        System.out.println("done");
    }

}
