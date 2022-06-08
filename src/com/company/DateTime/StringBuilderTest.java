package com.company.DateTime;

public class StringBuilderTest {

    public static void main(String[] args) {
//        This is just setting the length of the string builder to 100
        StringBuilder sb = new StringBuilder(100);
        System.out.println(sb.length() + ":" + sb.toString().length());
        System.out.println(sb.length());
        System.out.println(sb.toString().length());
        System.out.println(sb);



        String str = "java";
        StringBuilder sb1 = new StringBuilder("java");

//        its comparing the two objects so they are always false
        System.out.println(str.equals(sb1) + ":" + sb1.equals(str));

        System.out.println();
        System.out.println();
        StringBuilder sb3 = new StringBuilder("Java");
        String s1 = sb3.toString();
        String s2 = sb3.toString();
//        So both s1 and s2 refer to different String instances
//        even though their contents are same.
          System.out.println(s1 == s2);
        System.out.println(s1);
        System.out.println(s2);
    }

}
