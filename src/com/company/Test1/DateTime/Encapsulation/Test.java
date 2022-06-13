package src.com.company.Test1.DateTime.Encapsulation;

public class Test {
    private static void m(int x) {
        System.out.println("int version");
    }
//Method Overloaded
    private static void m(char x) {
        System.out.println("char version");
    }

    public static void main(String [] args) {
        int i = '5';
        m(i);
        m('5');

        System.out.println();

        Student s = new Student();
//        This is running the default values
        System.out.println(s.name + ":" + s.age);
    }

}
class Student {
    String name;
    int age;

    void Student() {
        Student("James", 25);
    }

    void Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
