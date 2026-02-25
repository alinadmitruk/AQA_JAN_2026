package org.prog.collections.session11;

import java.util.ArrayList;
import java.util.List;

public class MyList {
    public static void main(String[] args){
        List<Android> android = new ArrayList<>();
        List<Apple> apple = new ArrayList<>();

        android.add(new Android("S32","red"));
        android.add(new Android("S32","white"));
        android.add(new Android("S32","black"));
        android.add(new Android("S32","silver"));
        android.add(new Android("S32","orange"));
        android.add(new Android("S32","blue"));
        android.add(new Android("S32","pink"));
        android.add(new Android("S32","black"));
        android.add(new Android("S32","red"));
        android.add(new Android("S32","silver"));

        apple.add(new Apple("15Pro","black"));
        apple.add(new Apple("15Pro","gold"));
        apple.add(new Apple("15Pro","red"));
        apple.add(new Apple("15Pro","white"));
        apple.add(new Apple("15Pro","green"));
        apple.add(new Apple("15Pro","blue"));
        apple.add(new Apple("15Pro","green"));
        apple.add(new Apple("15Pro","silver"));
        apple.add(new Apple("15Pro","yellow"));
        apple.add(new Apple("15Pro","blue"));


        Android pinkAndroid = new Android("S32","pink");
        boolean result = android.contains(pinkAndroid);
        System.out.println("Android contains pink phone: "+result);

        Android goldAndroid = new Android("S32","gold");
        boolean result1 = android.contains(goldAndroid);
        System.out.println("Android contains gold phone: "+result1);

        Apple pinkApple = new Apple("15Pro","pink");
        boolean result2 = apple.contains(pinkApple);
        System.out.println("Apple contains pink phone: "+result2);

        Apple goldApple = new Apple("15Pro","gold");
        boolean result3 = apple.contains(goldApple);
        System.out.println("Apple contains gold phone: "+result3);
    }
}
