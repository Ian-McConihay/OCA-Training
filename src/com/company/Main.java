package src.com.company;

public class Main {

    public static void main(String[] args) {
//        recursion occurs with no exit
//        nothing will get printed without an exception
        try {
            main(args);
        } catch (Exception ex) {
            System.out.println("CATCH-");
        }
        System.out.println("OUT");

    }
}
