package org.prog.session6;

public class MyMain {
    public static void main(String[] args){
        MyTruck truck = new MyTruck();
        truck.name= "Alina ";
        truck.model="BMW ";
        truck.PlateNumber="B-TA 2552";


        String result = truck.getMyTruckInfo();
        System.out.println(result);
    }
}
