package com.java.Problem_Solving;

public class Left_upside_trangle {
    public static void main(String[] args) {
        /*
//        int n = 5;
//        * * * * *
//          * * * *
//            * * *
//              * *
//                *
        for (int i = 0; i < n; i++) {

            for(int j=1; j<=i; j++){
                System.out.print("  ");

            }
            for(int j=0; j<(n-i); j++){
                System.out.print("* ");

            }



            System.out.println();


        }

         */
        int n=4;
        for (int i = 0; i < n; i++) {
            for(int j=1; j<=i; j++){
                System.out.print("  ");
            }
            for(int j=0; j<(n-i); j++){
                System.out.print("* ");
            }
            for(int j=1; j<(n-i); j++){
                System.out.print("* ");
            }
            System.out.println();
        }

























        }
}
