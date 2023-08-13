package com.java.test;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;


public class CWH25_practiveset_ix_stars {
    public static void main(String[] args) {
//  Problem 1
/*        int n= 2;

        for (int i=n; i>0; i--){

            for(int j=0; j<i; j++){



            }

//            System.out.print("*");
            System.out.print("\n");   */


//        Problem 2
        /*
        Scanner sc = new Scanner(System.in);

        System.out.println("Please add number upto sum off odd number you wants");

        int sum = 0;
        int n= sc.nextInt();
        for(int i=0; i<n; i++){
            sum = sum + (2*i);

        }
        System.out.println("You're some of odd number is =");
        System.out.println(sum);



// Practice Problem 4
        Scanner sc = new Scanner(System.in);
        System.out.println("Please add number I will give table");
        int n = sc.nextInt();


//        int n = 10;
        for (int i = 10; i >= 1; i--) {
            System.out.printf("%d x %d = %d\n", n, i, n * i);

        }



         */
//        Problem No 5
//        factorial for 10!
     /*   Scanner sc = new Scanner(System.in);
        System.out.println("Please give factorial number");
        int n = sc.nextInt();
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println(factorial);

      */


//    Problem 9
        Scanner sc = new Scanner(System.in);
        System.out.println("Please give value to add table");

        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <=10; i++) {
            sum += (n * i);

        }
        System.out.println(sum);


    }

}