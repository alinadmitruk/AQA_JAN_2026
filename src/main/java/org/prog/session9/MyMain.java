package org.prog.session9;

public class MyMain {
    public static void main (String[] args) {
        Android android = new Android("G23","black");
        Android android1 = new Android(null, "white");



        try {
                android.equals(android1);

        }
    catch (MyPhoneException myPhoneException) {
        System.out.println("ooops!");
    }
    }}