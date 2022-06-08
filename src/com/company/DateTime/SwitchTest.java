package com.company.DateTime;

public class SwitchTest {
    public static void main(String[] args) {
//        All 3 of these work for the switch case
//        Integer var = 7;
//        char var = 7;
//        Character is the same as char
        Character var = 7;
        switch(var) {
            case 7:
                System.out.println("Lucky no. 7");
                break;
            default:
                System.out.println("DEFAULT");
        }
    }
}
