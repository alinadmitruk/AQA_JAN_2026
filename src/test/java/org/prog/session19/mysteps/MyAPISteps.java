package org.prog.session19.mysteps;

import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.prog.session14.AlloUAPage;

import java.time.Duration;
import java.util.List;

public class MyAPISteps {
    private WebDriver driver;
    private AlloUAPage alloPage = MyDriverSteps.getAlloPage();

    public static List<String> phoneModels;
    public static List<String> phonePrices;


    @When("I search for IPhone price")
    public void searchIphonePriсe() {
        alloPage.searchFor("IPhone 17Pro Max");
//        alloPage.waitUntil();
        phonePrices = alloPage.getPhonePrices();
        phoneModels = alloPage.getPhoneModel();
    }
}
