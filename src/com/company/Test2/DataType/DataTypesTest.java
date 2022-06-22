package src.com.company.Test2.DataType;

import java.util.ArrayList;
import java.util.List;

public class DataTypesTest {
    public static void main(String[] args) {
//      Boolean class code uses equalsIgnoreCase
        Boolean b1 = new Boolean("tRuE");
        Boolean b2 = new Boolean("fAlSe");
        Boolean b3 = new Boolean("abc");
        Boolean b4 = null; // can store null as null
        System.out.println(b1 + ":" + b2 + ":" + b3 + ":" + b4);
        System.out.println(new Boolean("ture"));



        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(100);
        list.add(200);
        list.remove(new Integer(100));
//By putting the Integer object it now can remove the first
//        element with the value of 100
        System.out.println(list);
        System.out.println("======");
        System.out.println(new Boolean("ture"));
    }
}
