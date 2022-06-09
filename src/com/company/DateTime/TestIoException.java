package src.com.company.DateTime;

import java.io.FileNotFoundException;
import java.io.IOException;

abstract class Super {
    public abstract void m1() throws IOException;
}

class Sub extends Super {
    @Override
    public void m1() throws IOException {
        throw new FileNotFoundException();
    }
}

public class TestIoException {
    public static void main(String[] args) {
        Super s = new Sub();
//        try {
//  This fails because it's not throwing/catch IOException
//  Causing a compilation error
//            s.m1();
//        } catch (FileNotFoundException e) {
//            System.out.print("M");
//        } finally {
//            System.out.print("N");
//        }
    }
}

