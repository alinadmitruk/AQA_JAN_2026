package org.prog.collections.session12;

public class Phone {
    public String model;
    public String color;

    public Phone(String model, String color) {
        this.model = model;
        this.color = color;
    }

    @Override
    public String toString() {
        return model+ " " +color;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Phone) {
            Phone other = (Phone) obj;
            return this.model.equals(other.model) && this.color.equals(other.color);
        }
        return false;
    }

    public int hashCode() {
        return (this.model + this.color).hashCode();
    }
}
