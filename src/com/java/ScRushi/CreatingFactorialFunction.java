package com.java.ScRushi;

import java.util.Scanner;


//Problem 2=    ncr = n!/r!* (n-r)!

public class CreatingFactorialFunction {

    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;

        }
        return fact;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Give value of X ");
        int x = sc.nextInt();
        System.out.println("Give value of Y ");
        int y = sc.nextInt();

        int xfact = factorial(x);
        int yfact = factorial(y);
        int xyfact = factorial(x - y);

        System.out.println("X fact  = " + xfact);
        System.out.println("Y fact  = " + yfact);
        System.out.println("x-y fact = " + (xfact) / (yfact * xyfact));


    }
}
