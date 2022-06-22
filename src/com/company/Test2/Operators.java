package src.com.company.Test2;

public class Operators {
    public static void main(String[] args) {
        int score = 60;
        switch (score) {
            default:
                System.out.println("Not a valid score");
            case 60:
                System.out.println("Failed");
                break;
//            case score >= 70://boolean arnt accepted in switch
//                System.out.println("Passed");
//                break;
        }
        int grade = 75;
        if(grade > 60) {
            System.out.println("Congratulations");
            System.out.println("You passed");
        } else {
            System.out.println("You failed");
        }
        int a = 2;
        boolean res = false;
        res = a++ == 2 || --a == 2 && --a == 2;
        System.out.println(a);
    }
}
