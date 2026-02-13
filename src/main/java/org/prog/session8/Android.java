package org.prog.session8;

public class Android implements IPhone{
    public String model;
    public String color;
    @Override
    public void call(String someone) {
        System.out.println("Android " + model + " " + color +" is callimg "+someone);
    }

    @Override
    public void unlockScreen() {
        System.out.println("Android screen is unlocked");
    }

}
