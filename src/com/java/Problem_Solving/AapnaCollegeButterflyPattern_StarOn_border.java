package com.java.Problem_Solving;

public class AapnaCollegeButterflyPattern_StarOn_border {
    public static void main(String[] args) {
        int n = 4;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                if(i==1||i==n||j==1||j==n||i==j){

                    System.out.print("*");

                }else {
                    System.out.print(" ");
                }



            }
            int space = 2*(n-i);
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");

            }
            for (int j = 1; j <= i; j++) {
                if(i==1||i==n||j==1||j==n||i==j){

                    System.out.print("*");

                }else {
                    System.out.print(" ");
                }

            }


            System.out.println();

        }

        for (int i =n-1; i >=1; i--) {

            for (int j = 1; j <=i; j++) {

                if(i==1||i==n||j==1||j==n||i==j){

                    System.out.print("*");

                }else {
                    System.out.print(" ");
                }

            }
            int space = 2*(n-i);
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");

            }
            for (int j = 1; j <= i; j++) {
                if(i==1||i==n||j==1||j==n||i==j){

                    System.out.print("*");

                }else {
                    System.out.print(" ");
                }

            }



            System.out.println();

        }


    }
}
