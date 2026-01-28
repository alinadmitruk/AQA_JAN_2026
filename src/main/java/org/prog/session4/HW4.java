package org.prog.session4;

public class HW4 {
    public static void main (String[] args){
        String[] emails = new String[]{
                "abcdefg@gmail.com",
                "a@gmail.com",
                "josh@@gmail.com",
                "janegmail.com",
                "pete@gmail.com",
                "zoe@gmailcom",
                "steve@outlook.com",
                "abcd@a.a",
                "abcd.a@fakemail"
        };

        for (int i = 0; i < emails.length; i++){
            if (emails[i].indexOf("@") >= 4 && emails[i].indexOf("@")==emails[i].lastIndexOf("@") && emails[i].indexOf(".")>=emails[i].indexOf("@")+1) {
                System.out.println(emails[i]);
            }

            }


        }
    }

