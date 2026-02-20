package org.prog.session8;

public class Apple implements IPhone{
    public String model;
    public String color;
    @Override
    public void call(String someone) {
        System.out.println("Phone is calling " + model+ " " +color+" is calling " + someone);
    }

    @Override
    public void unlockScreen() {

        System.out.println("Apple screen is unlocked");
    }


    public boolean equals(Object obj) {
        if (obj instanceof Apple) {
            Apple other = (Apple) obj;
            return this.model.equals(other.model) && this.color.equals(other.color);
        }
        return false;
    }

    public int hashCode(){
        System.out.println("Model hash: " + this.model.hashCode());
        System.out.println("Color hash: " + this.color.hashCode());
        System.out.println(this.model + this.color);
        System.out.println("Model + Color hash: " + (this.model + this.color).hashCode());
        return (this.model + this.color).hashCode();
    }
}


