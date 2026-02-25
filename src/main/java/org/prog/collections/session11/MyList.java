package org.prog.collections.session11;

import java.util.ArrayList;
import java.util.List;

public class MyList {
    public static void main(String[] args){
        List<String> android = new ArrayList<>();
        List<String> apple = new ArrayList<>();

        android.add("white");
        android.add("red");
        android.add("blue");
        android.add("silver");
        android.add("black");
        android.add("pink");
        android.add("silver");
        android.add("black");
        android.add("white");
        android.add("orange");

        apple.add("red");
        apple.add("white");
        apple.add("gold");
        apple.add("red");
        apple.add("black");
        apple.add("yellow");
        apple.add("green");
        apple.add("blue");
        apple.add("silver");
        apple.add("white");

        boolean result = android.contains("pink");
        System.out.println("Android contains pink phone: "+result);

        boolean result1 = android.contains("gold");
        System.out.println("Android contains gold phone: "+result1);

        boolean result2 = apple.contains("gold");
        System.out.println("Apple contains gold phone: "+result2);

        boolean result3 = apple.contains("pink");
        System.out.println("Apple contains pink phone: "+result3);
    }
}
