package org.prog.session4;

public class Main {

    public static void main(String[] args) {
//        0  - 0  - 0
//        1  - 1  - 1
//        2  - 2  - 10
//        3  - 3  - 11
//        4  - 4  - 100
//        5  - 5  - 101
//        6  - 6  - 110
//        7  - 7  - 111
//        8  - 8  - 1000
//        9  - 9  - 1001
//        10 - A  - 1010
//        11 - B  - 1011
//        12 - C  - 1100
//        13 - D  - 1101
//        14 - E  - 1110
//        15 - F  - 1111

//        String s1 = "some value";
//        String s2 = "and another value";
//        String s3 = "TO LOWER CASE";
//        System.out.println(s1);
//
//        System.out.println(s1.length()); //10
//        System.out.println(s2.length()); //0
//
//        System.out.println("=================================");
//        System.out.println(s1 + " \r\n " + s2);
//        System.out.println("=================================");
//        System.out.println(s1.toUpperCase());
//        System.out.println(s3.toLowerCase());
//
//        System.out.println(s1.charAt(0));
//        System.out.println(s1.charAt(1));
//        System.out.println(s1.charAt(4));
//        for (int i = 0; i < s1.toCharArray().length; i++) {
//            System.out.println("Chat at " + i + " : " + s1.toCharArray()[i]);
//        }
        String s4 = "some value as well";
        System.out.println(s4.indexOf("lu"));
        System.out.println(s4.indexOf("l"));
        System.out.println(s4.lastIndexOf("l"));
        System.out.println(">>>>>" + s4.indexOf("e", s4.indexOf("e") + 1));
        System.out.println(s4.equals("some value as well"));
        System.out.println(s4.equals("Some value as well"));
        System.out.println(s4.equalsIgnoreCase("Some value as well"));

        System.out.println("--------------------------------------");

        System.out.println(s4.startsWith("some"));
        System.out.println(s4.startsWith("Some"));
        System.out.println(s4.endsWith("ll"));
        String[] strings = s4.split(" ");
        System.out.println(strings.length);
        String s5 = "   " + s4 + "   ";
        System.out.println(s5);
        System.out.println(s5.trim());

    }
}
