package src.com.company.Test2.Encapsulation;
class Student {
//    a static variable will stay the same for all objects when
//    changed
//    static int age; obj age set to 1 obj age set to 3 now both are 3
    String name;
    int age;

    Student() {
//        the other constructor calls on this using this.
//        if we change to new Student() it will work
//        Student("James", 25);
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Methods {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name + ":" + s.age);
    }
}
