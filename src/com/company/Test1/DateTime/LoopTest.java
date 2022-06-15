package src.com.company.Test1.DateTime.Loops;

public class LoopTest {
    public static void main(String[] args) {
//        Do while execute once
//        false causes it to end
//        100
//        Bye
        do {
            System.out.println(100);
        } while (false);
        System.out.println("Bye");

        System.out.println();

        int[] arr = {2, 1, 0};
//        print in reverse
        for (int i : arr) {
            System.out.println(arr[i]);
        }
        System.out.println();
//        print in order
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
