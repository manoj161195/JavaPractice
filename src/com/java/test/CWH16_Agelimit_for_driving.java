package com.java.test;

import java.util.Scanner;

public class CWH16_Agelimit_for_driving {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Please Enter you're Age");
        int Age = SC.nextInt();
//        System.out.println(Age);
        int age = Age;

        if (age > 18 && age < 50) {
            System.out.println(" Good You Can drive");


        } else if (age == 18) {
            System.out.println(" PLEASE SHOW DL");


        } else if (age < 18) {
            System.out.println("Go home child");

        } else if (age == 50) {
            System.out.println("Age limit \"50\" is Completed");

        } else if (age > 50) {
            System.out.println("You'r age is more than 50");

        } else {
            System.out.println("You can not drive");
        }
    }
}
