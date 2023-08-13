package com.java.Problem_Solving;

public class Two_pyramidpattern {
    public static void main(String[] args) {

//    Problem & solution with space & less loop.
//  * * *
//   * *
//    *
//    *
//   * *
//  * * *

        /*
        int n = 5;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(" ");

            }

            for (int j = 0; j < (n) - i; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {

            for (int j = 0; j <(n - i)-1; j++) {
                System.out.print(" ");

            }
            for(int j=0; j<=i; j++){
                System.out.print("* ");

            }

            System.out.println();


        }

         */


//        Same problem with more loop
        /*
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");

            }
            for (int j = 0; j < (n - i); j++) {
                System.out.print("*");

            }
            for (int j = 0; j < (n - i) - 1; j++) {
                System.out.print("*");

            }

            System.out.println();
        }
        for (int i = 1; i <= n; i++) {

            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");

            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");

            }
            for (int j = 0; j < i - 1; j++) {
                System.out.print("*");

            }


            System.out.println();
        }

         */


    }
}
