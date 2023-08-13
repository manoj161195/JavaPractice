package com.java.Problem_Solving;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        int n =5;
//        for (int i=0; i<n; i++){
//            for (int j=n; j>=0; j--){
//                System.out.print("* ");
//
//            }
//            System.out.println();
//        }


//     Right side trangle =    Complex patthern
//        0, 1,2,3,4,5 = 2*n = 12 position


        for (int i = 0; i <= n; i++) {
            /*

            for (int j = 2 * (n - i); j >= 0; j--) { //For Loop for Row

//                10,9,8,7,6,5,4,3,2,1,0,+  i=0; need to print * at po= 0
//                08,7,6,5,4,3,2,1,0,+,+,+   i=1  ** required     po= 1,0
//                06,5,4,3,2,1,0,+,+,+,+,+
//                04,3,2,1,0,+,+,+,+,+,
//
//
//


                System.out.print("="); // Print Spaces

            }

            for (int j = 0; j <= i; j++) { //For Loop for col

                System.out.print("* "); // Print Star

            }

            System.out.println();

             */
            for(int j=n-i; j>=0; j--){
                System.out.print(" ");

            }
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();



        }




    }
}
