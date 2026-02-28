package org.prog.session13;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class JUnitMyTests {
    Apple phone = new Apple();




    @Test
    public void test1() {
        int number = phone.getModelNumber();
        Assertions.assertTrue(phone.getModelNumber()>= 3);
        System.out.println("test1: done");

    }
    @Test
    public void test2() {
        int number = phone.getModelNumber();
        Assertions.assertTrue(phone.getModelNumber()>= 3);
        System.out.println("test2: done");

    }
    @Test
    public void test3() {
        int number = phone.getModelNumber();
        Assertions.assertTrue(phone.getModelNumber()>= 3);
        System.out.println("test3: done");

    }
}
