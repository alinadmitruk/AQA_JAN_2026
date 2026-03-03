package org.prog.session14;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGTests2 {

    @BeforeTest
    public void beforeTest(){
        System.out.println("BEFORE TEST FOR FEATURE 1 and 2");
    }

    @Test
    public void myTestNGTest21(){
        System.out.println("myTestNGTest21");
    }

    @Test
    public void myTestNGTest22(){
        System.out.println("myTestNGTest22");
    }

    @Test
    public void myTestNGTest23(){
        System.out.println("myTestNGTest23");
    }
}
