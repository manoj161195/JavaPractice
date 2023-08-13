package com.java.test;

import java.util.Scanner;

public class CWH17_logical_operator {
    public static void main(String[] args) {
//        we have &&, ||, ! operator
        Scanner SC = new Scanner(System.in);
        System.out.println("Please add values in true & false");
        System.out.println("1st value");
        boolean a = SC.nextBoolean();

        System.out.println("2nd value");
        boolean b= SC.nextBoolean();

//        boolean a = true;
//        boolean b = false;

        if (a || b){
            System.out.println("True");


        }
        else {
            System.out.println("False");

        }



    }
}
