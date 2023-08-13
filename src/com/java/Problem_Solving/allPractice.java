package com.java.Problem_Solving;

public class allPractice {
    public static void main(String[] args) {
//        /*
//        int n=5;
//        for (int i=1; i<=n; i++) {
//
//          /*  for(int j=0; j<n-i; j++){
//                System.out.print("* ");
//
//            }
//            System.out.println();
//
//           */
//            for (int j = 0; j <= n; j++) {
//
//             /*   if(j>i){
//                    System.out.print("*");
//
//                }else {
//                    System.out.print(" ");
//                }
//
//              */
//                System.out.print(" # ");
//            }
//
//            System.out.println();
//            }*/


        int r = 5;


        for (int i = r; i >= 1; i--) {


            for (int j = r; j > i; j--) {

                System.out.print(""); // Prints Blank space

            }

            for (int k = 1; k <= i; k++) {

                System.out.print("*"); //Prints *

            }

            System.out.println(" "); //Prints blank spaces


        }
//        int n = 5;
//        for (int i = 1; i <= n; i++) {
//
//            for (int j = 0; j < (i - 1); j++) {
//                System.out.print(" ");
//
//
////                for (int k = 0; k <(n - j); k++) {
////                    System.out.print("*");
////
////                }
//
//
//            }
//            for (int k = 0; k < (n - i) + 1; k++) {
//                System.out.print("*");
//
//            }
//
//
//            System.out.println();
//
//        }
//
//
//    }
    }
}
