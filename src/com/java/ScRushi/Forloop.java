package com.java.ScRushi;

import javax.swing.plaf.IconUIResource;
import javax.xml.transform.Source;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Forloop {
    public static void main(String[] args) {
//        Problem 1
//         Print all factorial of N
      /*  Scanner sc = new Scanner(System.in);
        System.out.println("Please give N value");
        int count = 0;

        int n = sc.nextInt();
        System.out.println("Value of N = " + n);

        for (int i=1; i<=n; i++){
//            int x = n%i;
            if(n%i==0){
                System.out.println(i);
                count++;

            }
        }
        System.out.println("Count of" + n + "factorals are = "  + count);
        System.out.println("Loop End");

       */






//        Problem 2
//        Check number is Composit or Prime number

        Scanner sc = new Scanner(System.in);
        System.out.println("Give Value of N");
        int N = sc.nextInt();
        int Count = 0;
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                Count++;
            }
            if (Count > 2) {
                System.out.println("Composit");
                System.out.println("Loop Breaked");
                break;
            }
        }

        System.out.println("Value of count after For Loop = " + Count);


        if (Count == 2) {
            System.out.println("Prime Number");
        } else if (Count == 1) {
            System.out.println("Not Prime not Comp.");
        }


    }


}
