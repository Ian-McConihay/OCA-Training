package src.com.company.Test2;

public class LoopsConstructs {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1}; //if I added another number it would work
        for (int i : arr) {
//            so i iterates to 3 as the first element
//            this causes arr[3] which there is no index of 3
            System.out.println(arr[i]);
        }
    }
}
