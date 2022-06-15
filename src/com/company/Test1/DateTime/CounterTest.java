package src.com.company.Test1.DateTime;


import java.util.ArrayList;
import java.util.List;

class Counter {
    int count;
    Counter(int count) {
        this.count = count;
    }

    public String toString() {
        return "Counter-" + count;
    }
}

public class CounterTest {
    public static void main(String[] args) {
        ArrayList<Counter> original = new ArrayList<>();
        original.add(new Counter(10));
//
        ArrayList<Counter> cloned = (ArrayList<Counter>) original.clone();
        System.out.println(cloned);
        cloned.get(0).count = 6;

        System.out.println(original);

        StringBuilder sb = new StringBuilder(100);
        System.out.println(sb + ":" + sb.toString().length());


//        int[] cannot be converted to double[]
//        double [] arr = new int[2]; //Line 3
//        System.out.println(arr[0]); //Line 4
//        System.out.println("Output is: " + 10 != 5);
        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(100);
        list.add(200);
//        list.remove(100);
//This will throw an index out of bounds exception
        System.out.println(list);
    }
}
