package src.com.company.Test1.DateTime;

public class NullPointerTest {
    public static void main(String[] args) {
        Double [] arr = new Double[2];
        System.out.println(arr[0] + arr[1]);
//  a nullpointerexception goes off due to  the arr being
//  empty
    }
}
