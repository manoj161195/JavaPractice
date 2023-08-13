package com.java.test;

public class CWH80_arithmatic_exception_practice {
    public static void main(String[] args) {
        int a = 700;
        int b = 0;

//        int c = a/b;
//
//
        try {

            float c = a / b;
            System.out.println("Value of c is " + c);
        } catch (Exception e) {

            System.out.println("We found following exception in process");
            System.out.println(e);

            System.out.println("Loop is close");

        }


    }
}

