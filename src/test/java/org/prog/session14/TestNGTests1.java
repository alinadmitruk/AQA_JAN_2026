package org.prog.session14;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGTests1 {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Start BROWSER before all tests");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("CLOSE BROWSER");
    }

    @Test
    public void myTestNGTest11() {
        System.out.println("myTestNGTest11");
    }

    @Test
    public void myTestNGTest12() {
        System.out.println("myTestNGTest12");
    }

    @Test
    public void myTestNGTest13() {
        System.out.println("myTestNGTest13");
    }

    @Test(dataProvider = "dataTest1")
    public void myTestNGTest14(String s1, String s2, int i) {
        System.out.println(s1 + " " + s2 + " " + i);
    }

    @DataProvider
    public Object[][] dataTest1() {
        return new Object[][]{
                {"this", "is", 1},
                {"this", "is", 2},
                {"this", "is", 3},
                {"this", "is", 4}
        };
    }
}
