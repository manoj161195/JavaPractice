package com.java.test;

import java.util.Scanner;

public class MathematicalExpressionStarWithSpace {
    public static void main(String[] args) {
       /* System.out.println("Solid Rectangle problem");


        for(int i =0; i< 5; i++) {
            for(int j=0; j<5; j++){
                System.out.print("*");

            }
            System.out.println();


        }
        System.out.println("Loop end"); */


//        Problem 2
/*
        int i = 0;
        int j = 0;

        for (j = 0; j <= 4; j++) {

            for (i = 0; i <= 4; i++) {
                if (i == j || i > j) {
                    System.out.print(" * ");
                } else {
                    System.out.println(" ");
                }
            }
            System.out.println();
        }
        System.out.println("Loop End");

 */
//        Problem 3
//        Right side trangle

       /* for(int i=0; i<5;i++ ){

            for(int j=0; j<=i; j++ ){
                System.out.print("*");

            }
            System.out.println(); */

//         Double trangle question
        int n = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("please provide number of lines you want to print");
        n = s.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
                if(j!=i) {
                    for (int k = 0; k < 1; k++) {
                        System.out.print("_");
                    }
                }


            }
            System.out.println();
        }


    }
}



