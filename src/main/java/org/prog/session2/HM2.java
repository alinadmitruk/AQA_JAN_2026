package org.prog.session2;

import java.util.Random;

public class HM2 {

    public static void main(String[] args) {
        Random random=new Random();

       while(true) {
           int i = random.nextInt(1000);
        int j = random.nextInt(1000);

        System.out.println(i);
        if (i + j % 7 == 0) {
            System.out.println("Break on (i+j)%7");
            break;
        }
    }
}}
