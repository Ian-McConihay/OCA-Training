package src.com.company.Test2.Inheritance;
class Vehicle {
    public int getRegistrationNumber() {
        return 1;
    }
}

class Car {
    public int getRegistrationNumber() {
        return 2;
    }
}
public class InheritanceTest1 {
    public static void main(String[] args) {
//        This wont work because Car doesnt extend Vehicle
//        Vehicle obj = new Car();
//        System.out.println(obj.getRegistrationNumber());
    }
}
