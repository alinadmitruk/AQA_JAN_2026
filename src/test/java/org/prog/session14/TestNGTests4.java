package org.prog.session14;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGTests4 {

    @BeforeTest
    public void beforeTest(){
        System.out.println("BEFORE TEST FOR FEATURE 3 and 4");
    }

    @Test
    public void myTestNGTest41(){
        System.out.println("myTestNGTest41");
    }

    @Test
    public void myTestNGTest42(){
        System.out.println("myTestNGTest42");
    }

    @Test
    public void myTestNGTest43(){
        System.out.println("myTestNGTest43");
    }


}
