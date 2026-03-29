package org.prog.session19.mysteps;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@CucumberOptions (
        tags = "@wip",
        features = "src/test/resources/features",
        glue = "org.prog.session19.mysteps"
)
public class CucumberRunner extends AbstractTestNGCucumberTests {
    private Connection connection;
    private WebDriver driver;

    @BeforeSuite
    public void beforeSuite() throws SQLException {
        connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/db",
                "root",
                "password"
        );
        MyDBSteps.connection = connection;

        driver = new ChromeDriver();
        MyDriverSteps.driver = driver;
    }

    @AfterSuite
    public void afterSuite() throws SQLException {
        try {
            connection.close();
        } catch (Exception e) {
        }
        try {
            driver.quit();
        } catch (Exception e) {
        }
    }
}

