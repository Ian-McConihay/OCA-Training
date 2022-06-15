package src.com.company.Test1.DateTime;

import java.util.ArrayList;
import java.util.List;

public class RuntimeTest {
//    static {
//        System.out.println(1/0);
//    }

    private static void m1() throws Exception { //Line 6
        System.out.println("NOT THROWING ANY EXCEPTION"); //Line 7
    }

    public static void main(String[] args) {
//  This breaks because the main method is not throwing Exception
        //    m1();

        System.out.println("HELLO");


        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(100);
        list.add(200);
//        .remove goes off of the list index
//        list.remove(100);
//        this works
//        list.remove(1);

        System.out.println(list);


//  Fill in the blanks for the definition
//  of java.lang.Error class:
//
//public class java.lang.Error extends __________
//        Throwable


// char can print white space
        Test one = new Test();
        System.out.println(one.var1);
    }

    public static class Test {
        char var1;
        double var2;
        float var3;
    }
}
