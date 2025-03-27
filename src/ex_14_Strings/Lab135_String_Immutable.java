package ex_14_Strings;

public class Lab135_String_Immutable {
    public static void main(String[] args) {
        String name ="Wais";
        name.toUpperCase(); //WAIS its a function that makes every character capital.
        name=name.toUpperCase(); //by declaring a new value, it will print it all in capital.
        System.out.println(name);//this still prints name in lower case because its still fetching from the old pool. we need to point to the latest one.

    }
}
