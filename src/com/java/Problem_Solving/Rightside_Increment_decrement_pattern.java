package com.java.Problem_Solving;

public class Rightside_Increment_decrement_pattern {
    public static void main(String[] args) {
        int n = 8;
        for (int i = 0; i < n; i++) {

            for (int j = 1; j < (n - i); j++) {
                System.out.print(" ");
            }

            for (int k = 0; k <= i; k++) {
                System.out.print("*");

            }

            System.out.println();
        }
        for (int i = 0; i < n; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print(" ");

            }
            for (int k = 1; k < (n - i) ; k++) {
                System.out.print("*");

            }
            System.out.println();

        }


    }


}






