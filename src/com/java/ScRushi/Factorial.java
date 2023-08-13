package com.java.ScRushi;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {


//    Problem 1 calculate factorial
//  Problem 2=    ncr = n!/r!* (n-r)!

  /*      int n = 5;
        int fact = 5;

        for (int i = 1; i < n; i++) {
            fact = fact * i;

        }
        System.out.println(fact);

   */


//    Problem 2

        System.out.println("Add factorial number");
        Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
        int fact =1;

        for(int i=1; i<=n; i++ ){
            fact = fact* i;
            System.out.println("F value = " + fact);

        }

        System.out.println("Factorial of " + n + "= " + fact );




       /* int n = sc.nextInt();
        int fact =1;
        for(int i=1; i<=n; i++){
            fact = fact*i;
        }
        System.out.println(fact);

        */















    }


}
