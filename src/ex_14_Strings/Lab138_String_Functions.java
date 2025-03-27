package ex_14_Strings;

import java.sql.SQLOutput;

public class Lab138_String_Functions {
    public static void main(String[] args) {
        char c ='A';
        System.out.println(c);

        String s1 = "THE WHOLE HOUSE IS PARTYING, ";
        System.out.println(s1.length());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.concat("so the landlord called the cops."));
    }
}
