package src.com.company.Test1.DateTime;

import java.util.ArrayList;
import java.util.List;

public class ArrayTest {


    public static void main(String[] args) {
//        Both work
        List<String> list = new ArrayList<>();
        List<String> stringList = new ArrayList<String>();

        int i = '5';
        System.out.println(i);

//        All of these solutions work
//         int n = 0; n < arr.length; n += 1
//         int n = 0; n <= arr.length; n += 1
//         int n = 1; n < arr.length; n += 2
//         int n = 1; n <= arr.length; n += 2
//        String [] arr = {"I", "N", "S", "E", "R", "T"};
//        for(/*INSERT*/) {
//            if (n % 2 == 0) {
//                continue;
//            }
//            System.out.print(arr[n]); //Line n1
//        }
        short [] arr;
        arr = new short[3];
//  you create a new object in the same or next statement

//        byte [] arr = new byte[10];
//  byte arr has 10 elements set to zero
//        int [] arr = new int[]{0, 0, 0, 0};
//  int arr has 4 elements set tow zero
        /*INSERT*/
        arr[1] = 5;
        arr[2] = 10;
        System.out.println("[" + arr[1] + ", " + arr[2] + "]"); //Line n1

    }
}
