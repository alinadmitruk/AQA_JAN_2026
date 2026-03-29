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
//        alloPage.loadPage();
//        alloPage.acceptCookiesIfPresents();
        alloPage.searchFor("IPhone 17Pro Max");
        alloPage.waitUntil();
        alloPage.getPhonePrices();
        alloPage.getPhoneModel();


        System.out.println("done");}}




