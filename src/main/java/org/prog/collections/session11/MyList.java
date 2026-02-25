package org.prog.collections.session11;

import java.util.ArrayList;
import java.util.List;

public class MyList {
    public static void main(String[] args){
        List<> android = new ArrayList<>();
        List<> apple = new ArrayList<>();



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
