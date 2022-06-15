package src.com.company.Test1.DateTime;

public class IfElseTest {
    public static void main(String[] args) {
//This won't work because a string cant be compare to an int
//        Compilation error
//        System.out.println("Output is: " + 10 != 5);

// bytes range is only to 127


//        everything prints because the default has no break
        String fruit = "mango";
        switch (fruit) {
            default:
                System.out.println("ANY FRUIT WILL DO");
            case "Apple":
                System.out.println("APPLE");
            case "Mango":
                System.out.println("MANGO");
            case "Banana":
                System.out.println("BANANA");
                break;
        }
//-a++; [a = 100].
//There are 2 operators involved. unary minus and Postfix operator.
// Let's start with expression and value of a.
//-(a++); [a = 100] Postfix operator has got higher precedence
// than unary operator.
//
//-(100); [a = 101] Use the value of a (100) in the expression
// and after that increase the value of a to 101.
//
//-100; [a = 101] -100 is printed on to the console.

        int a = 100;
        System.out.println(-a++);


//Compliatioin error will occur due to the compiler
//not knowing models value
    double price = 90000;
    String model;
         if(price > 100000) {
        model = "Tesla Model X";
    } else if(price <= 100000) {
        model = "Tesla Model S";
    }
//           System.out.println(model);


//main method's parameter variable name is "args"
// and it is a local to main method.
//So, same name "args" can't be used directly within
// the curly brackets of main method.
//        Compilation error
//        short [] args = new short[]{50, 50};
//        args[0] = 5;
//        args[1] = 10;
//        System.out.println("[" + args[0] + ", " + args[1] + "]");
    }

}

