package org.prog.session4;

//TODO: print only correct emails
// Correct email rules:
// - at least 3 symbols before @
// - only @ symbol
// - full domain name (must have at least one ".")


public class HomeWorkString {

    public static void main(String[] args) {
        String[] emails = new String[]{
                "abcdefg@gmail.com", //+
                "a@gmail.com", //-
                "josh@@gmail.com", //-
                "janegmail.com", // -
                "pete@gmail.com", //+
                "zoe@gmailcom", //-
                "steve@outlook.com", //+
                "abcd@a.a", //+
                "abcd.a@fakemail" //-
        };

        for (int i = 0; i < emails.length; i++) {
            if (emails[i].equals("abcdefg@gmail.com")) {
                System.out.println(emails[i]);
            }
        }
    }
}
