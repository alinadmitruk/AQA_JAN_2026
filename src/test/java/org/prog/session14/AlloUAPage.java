package org.prog.session14;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.lang.model.util.Elements;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static org.prog.session19.mysteps.MyDriverSteps.alloPage;

public class AlloUAPage {
    private final WebDriver driver;
    private final String baseUrl;

    public AlloUAPage(WebDriver driver, String baseUrl) {
        this.driver = driver;
        this.baseUrl = baseUrl;
    }

    public void loadPage() {
        driver.get(baseUrl);
    }

    private final By searchField = By.name("search");
    private final By productCard = By.className("product-card");
    private final By price = By.className("sum");
    private final By phoneModel = By.className("product-card__title");

    public void acceptCookiesIfPresents() {
        List<WebElement> cookieButtons = driver.findElements(By.id("cookies-accept"));
        if (!cookieButtons.isEmpty()) {
            cookieButtons.get(0).click();
            System.out.println("cookies accepted");
        } else
            System.out.println("cookies not found");

    }

    public void searchFor(String productName) {

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

    public List<String> getPhonePrices() {
        List<WebElement> products = driver.findElements(By.className("product-card"));
        List<String> prices = new ArrayList<>();
        System.out.println("Знайдено товарів: " + products.size());

        if (products.size() >= 3) {
            WebElement product1 = products.get(0);
            WebElement product2 = products.get(1);
            WebElement product3 = products.get(2);

            List<WebElement> price1 = product1.findElements(price);
            List<WebElement> price2 = product2.findElements(price);
            List<WebElement> price3 = product3.findElements(price);

            if (price1.size() > 0) {
                String priceText = price1.get(0).getText();
                priceText=priceText.replace(" ","");
                prices.add(priceText);
                System.out.println("price1= " + priceText);
            } else {
                System.out.println("Price1 is not found");
            }
            if (price2.size() > 0) {
                String priceText2 = price2.get(0).getText();
                priceText2=priceText2.replace(" ","");
                prices.add(priceText2);
                System.out.println("price2= " + priceText2);
            } else {
                System.out.println("Price2 is not found");
            }
            if (price3.size() > 0) {
                String priceText3 = price3.get(0).getText();
                priceText3=priceText3.replace(" ","");
                prices.add(priceText3);
                System.out.println("price3= " + priceText3);
            } else {
                System.out.println("Price3 is not found");
            }
        }

        return prices;
    }

    public List<String> getPhoneModel() {
        List<WebElement> model = driver.findElements(phoneModel);
        List<String> result = new ArrayList<>();

        if (model.size() >= 3) {
            String model1 = model.get(0).getText();
            String model2 = model.get(1).getText();
            String model3 = model.get(2).getText();

            result.add(model1);
            result.add(model2);
            result.add(model3);
            System.out.println("model1 = " + model1);
            System.out.println("model2 = " + model2);
            System.out.println("model3 = " + model3);
        } else {
            System.out.println("Знайдено менше 3 моделей");
        }

        return result;
    }

}







