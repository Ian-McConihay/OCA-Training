package src.com.company.Test2.Encapsulation;

public class MethodsOne {
    public String name;

//    Just a method
    public void Test() {
        name = "James";
    }

    public static void main(String [] args) {
        MethodsOne obj = new MethodsOne();
//        This prints null because there is no constructor
//        Java compiler creates an empty constructor MethodsOne(){}
//        so its an empty obj
        System.out.println(obj.name); //reads null
        obj.Test(); //method sets the name to James
        System.out.println(obj.name);

    }
}
