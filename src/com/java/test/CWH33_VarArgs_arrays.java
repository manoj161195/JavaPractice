package com.java.test;

public class CWH33_VarArgs_arrays {
//    Creating VarArgs

    static int sum(int... arr) {
        int result = 0;
        for (int a : arr) {

            result += a;
        }
        return result;


    }

    public static void main(String[] args) {
        System.out.println("Do more practice MAN\n   Sum is ="+ sum(1,2,3,4,5));
        System.out.println("Do more practice MAN\n   Sum is ="+ sum(1,2,6,4,5));
        System.out.println("Do more practice MAN\n   Sum is ="+ sum(1,2,7,4,5));
        System.out.println("Do more practice MAN\n   Sum is ="+ sum(1,2,8,4,5));
        System.out.println("Do more practice MAN\n   Sum is ="+ sum(1,2,9,4,5));



    }


}

