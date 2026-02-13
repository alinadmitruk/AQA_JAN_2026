package org.prog.session8;

public class Apple implements IPhone{
    public String model;
    public String color;
    @Override
    public void call(String someone) {
        System.out.println("Phone "+model+" " + color + " is calling " + someone);
    }

    @Override
    public void unlockScreen() {
     System.out.println("Apple screen is unlocked");
    }

}
