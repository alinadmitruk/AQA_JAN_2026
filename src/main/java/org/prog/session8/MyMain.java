package org.prog.session8;

public class MyMain{
    public static void main (String[] args){
        Apple apple = new Apple();
        apple.model="15Pro";
        apple.color="blue";


        Android android = new Android();
            android.model = "Galaxy S23";
            android.color = "white";

            android.unlockScreen();
            android.call("Sonya");
        System.out.println("======================");

            apple.unlockScreen();
            android.call("Alex");
}}
