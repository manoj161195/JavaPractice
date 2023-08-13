package com.java.test.AapnaCollege;

import java.sql.SQLOutput;

public class ApnaCollege_patternpratice {
    public static void main(String[] args) {

//    Video link = https://www.youtube.com/watch?v=GjHNGM7KN3w&list=PLfqMhTWNBTe3LtFWcvwpqTkUSlB32kJop&index=5

//        first problem solid rectangle
      /*  int n=5;
        int m=4;
//        Outer loop
        for(int i=0; i<5;i++){
//            inner for loop
            for (int j=1; j<=4; j++){
                System.out.print("*");
            }
            System.out.println("\n"); */


//        Problem 2
      /*  int n = 4;
// Outer loop
        for (int i = 1; i <= n; i++) {
//            Inner loop - Print space
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");


            }
//            Inner loop - for star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");


            }
            System.out.println();


        }*/





//        Problem 3
       /* int n = 5;
        for (int i =1; i<=5; i++){

            for (int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();      */
//
//            Problem 4
            int n = 5;
            for (int i =1; i<=5; i++){

                for (int j=5; j>=i; j--){
                    System.out.print(j);
                }
//                for(int j=5; j>=1; j--){
//                    System.out.print(" ");
//
//                }
                System.out.println();






        }


    }


}
