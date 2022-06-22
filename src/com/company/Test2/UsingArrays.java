package src.com.company.Test2;

public class UsingArrays {
    public static void main(String[] args) {
//        int[] arr1 = new int[3]{1,2,3,4};
//        You can't specify size at the time of initializing
//        with data, hence new int[3]{10, 20, 30};
//        gives compilation error.
        int[] arr2 = {1, 2, 3, 4};
        char[] arr3[] = new char[5][];
        byte[] arr4 = new byte[10];
        String [] arr = new String[7];
//        Variable arr refers to an array object of
//        String of 7 elements.
//        Variable arr contains the memory address of
//        String array object.
//        arr is of reference type,
//        hence it prints some String Containing @ symbol.
        System.out.println(arr);
//        We have not passed any command-line arguments,
//        hence args refers to an array object of Size 0
//        .
//        args.length prints 0. args is not null
//        and hence no NullPointerException.

//        we are not accessing array element
//        so no question of ArrayIndexOutOfBoundsException
        System.out.println(args.length);
    }
}
