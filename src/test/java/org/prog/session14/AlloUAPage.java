package org.prog.session14;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.lang.model.util.Elements;
import java.time.Duration;
import java.util.List;

public class AlloUAPage {
    private final WebDriver driver;
    private final String baseUrl;
    public AlloUAPage(WebDriver driver,String baseUrl) {
        this.driver=driver;
        this.baseUrl=baseUrl;
    }
    public void loadPage(){
        driver.get(baseUrl);
    }

    private final By searchField = By.name("search");
    private final By productCard = By.className("product-card");
    private final By price = By.className("sum");

    public void acceptCookiesIfPresents(){
        List<WebElement> cookieButtons = driver.findElements(By.id("cookies-accept"));
        if (!cookieButtons.isEmpty()){
            cookieButtons.get(0).click();
            System.out.println("cookies accepted");
        }
        else
            System.out.println("cookies not found");

    }
    public void searchFor(String productName){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
        WebElement searchField = wait.until(
                ExpectedConditions.elementToBeClickable(By.name("search")));
        searchField.click();
        searchField.sendKeys(productName);
        searchField.sendKeys(Keys.ENTER);

    }
    public void waitUntil() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
        wait.until(driver -> driver.findElements(productCard).size() >= 3);
    }
    public void findElements (){
        List<WebElement> products = driver.findElements(By.className("product-card"));
        System.out.println("Знайдено товарів: " + products.size());
    }


}
