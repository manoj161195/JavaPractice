package com.java.test;

import java.util.Scanner;

public class CWH18_video_Switch_Break {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Please Enter you're Age");
        int Age = SC.nextInt();
//        System.out.println(Age);
        int age = Age;

        switch (age) {

            case 18:
                System.out.println("Please show DL");
                break;
            case 50:
                System.out.println("50 age completed");
                break;
            case 100:
                System.out.println("RIP man");
                break;
            case 80:
                System.out.println("still living");
                break;
            default:
                System.out.println("Doing good keep it up");


        }
        System.out.println("Switch End above");


//
//        if (age > 18 && age < 50) {
//            System.out.println(" Good You Can drive");
//
//
//        } else if (age == 18) {
//            System.out.println(" PLEASE SHOW DL");
//
//
//        } else if (age < 18) {
//            System.out.println("Go home child");
//
//        } else if (age == 50) {
//            System.out.println("Age limit \"50\" is Completed");
//
//        } else if (age > 50) {
//            System.out.println("You'r age is more than 50");
//
//        } else {
//            System.out.println("You can not drive");
//        }

    }
}
