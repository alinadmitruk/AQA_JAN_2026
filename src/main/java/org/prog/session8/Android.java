package org.prog.session8;

public class Android implements IPhone {
    public String model;
    public String color;

    @Override
    public void unlockScreen(){
        System.out.println("Android screen is unlocked");
}

    @Override
    public void call(String someone) {
        System.out.println("Android " + model+ " " +color+" is calling "+ someone);
    }


    public boolean equals(Object obj) {
        if (obj instanceof Android) {
            Android other = (Android) obj;
            return this.model.equals(other.model) && this.color.equals(other.color);
        }
        return false;
    }

    public int hashCode(){
        return (this.model + this.color).hashCode();
    }
    }
