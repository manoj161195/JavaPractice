package com.java.test;

public class CWH31_32_methods_in_java_and_viod_method_creation {

    static void joke() {
        System.out.println("You are tring this is good \n MANOJ");
    }

    static int Output(int x, int y) {
        int Z;
        if (x > y) {
            Z = x + y;
        } else {
            Z = (x + y) * 5;
        }
        return Z;


    }

    public static void main(String[] args) {
        int a = 10;
        int b = 4;
        int c = Output(a, b);

        int a1 = 2;
        int b1 = 5;
        int c1 = Output(a1, b1);
        System.out.println(c);
        System.out.println(c1);


    }
}
