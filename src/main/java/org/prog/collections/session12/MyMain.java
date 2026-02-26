package org.prog.collections.session12;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MyMain {
    public static void main (String[] args){
        Set<Phone> set1 = new HashSet<>();
        set1.add(new Phone("12pro", "white"));
        set1.add(new Phone("15pro", "black"));
        set1.add(new Phone("14max", "red"));

        Set<Phone> set2 = new HashSet<>();
        set2.add(new Phone("s32", "red"));
        set2.add(new Phone("g10", "blue"));
        set2.add(new Phone("l30", "gold"));

        Set<Phone> set3 = new HashSet<>();
        set3.add(new Phone("1111", "red"));
        set3.add(new Phone("5555", "green"));
        set3.add(new Phone("9999", "orange"));



     Map<Owner, Set<Phone>> phoneOwner =new HashMap<>();

        Owner owner1 = new Owner();
        Owner owner2 = new Owner();
        Owner owner3 = new Owner();

        owner1.name = "Jane";
        owner2.name="Chris";
        owner3.name="Jack";

        phoneOwner.put(owner1, set1);
        phoneOwner.put(owner2, set2);
        phoneOwner.put(owner3, set3);

        phoneOwner.get(new Owner("Chris"));








    }
}
