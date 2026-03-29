package org.prog.session19.mysteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.prog.session14.AlloUAPage;

import java.util.List;

public class MyDriverSteps {
    public static WebDriver driver;
    public static AlloUAPage alloPage;

    @Given("I open Allo.ua page")
    public void openPage() {
//        driver = new ChromeDriver();
        driver.manage().window().maximize();
        alloPage = new AlloUAPage(driver, "https://allo.ua");
        alloPage.loadPage();
        alloPage.acceptCookiesIfPresents();
    }

    public static AlloUAPage getAlloPage() {
        return alloPage;
    }
}