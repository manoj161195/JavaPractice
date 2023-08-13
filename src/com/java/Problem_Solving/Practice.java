package com.java.Problem_Solving;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
//      Problem 1
      /*  int n=5;

        for (int i=0; i<n; i++){

            for(int j=0; j<n-i; j++){
                System.out.print("*");

            }
            System.out.println();

        }

       */
//        problem 2 inc & dec

        Scanner sc = new Scanner(System.in);
        System.out.println("Please give value of N");
        int n = sc.nextInt();
        for (int i=0; i<=n; i++){
            for (int j=0; j<i; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        for (int i = n-1; i>0; i--){
            for (int j=0; j<=i-1; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }


//        Scanner sc = new Scanner(System.in); //Input
//
//        System.out.println("Enter the number of rows: ");
//
//        int rows = sc.nextInt();
//
//        for (int i = 0; i <= rows - 1; i++) { //For Loop for Row
//
//            for (int j = 0; j <= i; j++) { //For Loop for Col
//
//                System.out.print("*" + " "); //prints * and blank space
//
//            }
//
//            System.out.println(""); // new line
//
//        }
//
//        for (int i = rows - 1; i >= 0; i--) { //For Loop for Row
//
//            for (int j = 0; j <= i - 1; j++) { //For Loop for Col
//
//                System.out.print("*" + " "); //prints * and blank space
//
//            }
//
//            System.out.println("");// new line
//
//        }
//
//        sc.close();

    }


    }


