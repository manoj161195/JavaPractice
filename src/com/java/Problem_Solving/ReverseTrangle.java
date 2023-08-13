package com.java.Problem_Solving;

public class ReverseTrangle {
    public static void main(String[] args) {
        int n = 5;

//        for(int i=0; i<n; i++){
//
//            for(int j=n; j<=(n-1) ; j--){
//                System.out.print("-");
//                if() {
//                    System.out.print("_");
//                }else {
//                    System.out.println("*");
//                }
//
//            }
//            System.out.println();
//        int k =0;

//        Problem 2 right side trangle

      /*  for (int i =0; i<=n; i++){
            for(int j = 0; j <((n-1)-i); j++) {

                System.out.print("_");
                if( j==n) {
                    for (int k=0; k <=n; k++) {
                        System.out.print("*");


                    }

                }else {}
            }
            System.out.println();

       */
//        for (int i = 0; i <= n; i++) {
//            for (int j = 1; j < ((n - 1) - i); j++) {
//                if (j == n || j == (n - 1) - i) {
//                    System.out.print("* ");
//                } else {
//                    System.out.print("_");
//                }
//
//            }
//            System.out.println();
//        }
//        System.out.println();
        for (int i = 0; i < n; i++) {

            for (int j = 2 * (n - i); j >= 0; j--) { //For Loop for Row

                System.out.print(" "); // Print Spaces

            }

            for (int j = 0; j <= i; j++) { //For Loop for col

                System.out.print("* "); // Print Star

            }

            System.out.println();

        }

    }


//
//        }


}

