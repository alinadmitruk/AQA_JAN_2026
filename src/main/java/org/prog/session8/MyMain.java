package org.prog.session8;

public class MyMain{
    public static void main (String[] args) {
        Apple apple = new Apple();
        apple.model = "15Pro";
        apple.color = "blue";
        Apple apple1 = new Apple();
        apple1.model ="15Pro";
        apple1.color = "red";


        Android android = new Android();
        android.model = "Galaxy S23";
        android.color = "white";
        Android android1 = new Android();
        android1.model="Galaxy S23";
        android1.color="black";

        usePhone(android,"Alex");
        System.out.println("==================");

        usePhone(android1, "Maria");
        System.out.println("==================");

        usePhone(apple, "Erik");

        System.out.println("===============");

        usePhone(apple1, "Lenny");

        System.out.println("===============");

        System.out.println("apple equals apple1: "+ apple.equals(apple1));
        System.out.println("android equals android1: "+ android.equals(android1));
        System.out.println("=============");
        System.out.println("Apple Model + Color hash: " + (apple.model + apple.color).hashCode());
        System.out.println("Apple1 Model + Color hash: " + (apple1.model + apple1.color).hashCode());
        System.out.println("Android Model + Color hash: " + (android.model + android.color).hashCode());
        System.out.println("Android1 Model + Color hash: " + (android1.model + android1.color).hashCode());
    }

        public static void usePhone (IPhone phone, String someone){
            phone.unlockScreen();
       phone.call(someone);




    }}