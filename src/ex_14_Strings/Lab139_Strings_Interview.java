package ex_14_Strings;

public class Lab139_Strings_Interview {
    public static void main(String[] args) {
        String name = "Wais";
        name = name.toUpperCase();
        System.out.println(name);

        String s1 = "Hello"; //stored in SCP
        String s2 = "Hello"; //stored in SCP
        String s3 = "Hello";//stored in SCP all of this only creates one String in the memory

        String s4 = new String("Hello"); //a new string is stored in Object Area
        String s5 = new String("Hello"); //a new string is stored in Object Area
        String s6 = new String("Hello");//a new string is stored in Object Area. a total of 3 new strings created.


    }
}
