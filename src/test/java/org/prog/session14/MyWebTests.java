package org.prog.session14;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.tracing.opentelemetry.SeleniumSpanExporter;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class MyWebTests {
    private WebDriver driver;
    private AlloUAPage alloPage;

    @BeforeTest
    public void setUp(){ driver = new ChromeDriver();
        driver.manage().window().maximize();
        alloPage = new AlloUAPage(driver, "https://allo.ua");


    }
    @AfterTest
    public void tearDown(){driver.quit();
    }

    @Test
    public void myWebTest() {
       alloPage.loadPage();
       alloPage.acceptCookiesIfPresents();
       alloPage.searchFor("IPhone 17Pro Max");
       alloPage.waitUntil();


        List<WebElement> products = driver.findElements(By.className("product-card"));
        System.out.println("Знайдено товарів: " + products.size());


        if (products.size()>=3) {
            WebElement product1 = products.get(0);
            WebElement product2 = products.get(1);
            WebElement product3 = products.get(2);

            List<WebElement> price1 = product1.findElements(By.className("sum"));
            List<WebElement> price2 = product2.findElements(By.className("sum"));
            List<WebElement> price3 = product3.findElements(By.className("sum"));

        if (price1.size() > 0) {
            String priceText = price1.get(0).getText();
            System.out.println("price1= "+priceText);
        } else {
            System.out.println("Price1 is not found");
        }
            if (price2.size()> 0) {
                String priceText2 = price2.get(0).getText();
                System.out.println("price2= "+priceText2);
            } else {
                System.out.println("Price2 is not found");
            }
                if (price3.size()> 0) {
                    String priceText3 = price3.get(0).getText();
                    System.out.println("price3= "+priceText3);
                } else {
                    System.out.println("Price3 is not found");
                }

            }








        System.out.println("done");}}


