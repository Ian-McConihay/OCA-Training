package src.com.company.Test2.Inheritance;


class Parent {
    public String toString() {
        return "Inner ";
    }

}

class Child extends Parent {
    public String toString() {
        return super.toString().concat("Peace!");
    }
}
public class InheritanceTest {
    public static void main(String[] args) {
//        By calling the class object or creating the object
//        it invokes the toString method
        Parent parent = new Parent();
        System.out.println(parent);
        System.out.println(new Parent());

        System.out.println(new Child());

    }
}
