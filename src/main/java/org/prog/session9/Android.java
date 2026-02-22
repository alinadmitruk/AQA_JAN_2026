package org.prog.session9;

public class Android {
    public String model;
    public String color;

    public Android(String model, String color) {
        this.model = model;
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Android) {
            Android other = (Android) obj;

            if (this.model == null || this.color == null)
                throw new MyPhoneException("Model or color is null");


            if (other.model == null || other.color == null) {
                throw new MyPhoneException("Model or color is null");
            }
            return this.model.equals(other.model) && this.color.equals(other.color);
        }
                return false;
            }

    public int hashCode(){
        if (model==null||color==null)
            throw new MyPhoneException("Model or color is null");
        System.out.println();
        return (this.model + this.color).hashCode();
    }
        }