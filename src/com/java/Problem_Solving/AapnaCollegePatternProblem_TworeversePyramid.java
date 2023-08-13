package com.java.Problem_Solving;

public class AapnaCollegePatternProblem_TworeversePyramid {
    public static void main(String[] args) {
        int n = 4;


//        Video & My approch
//        Case 1
        /*

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");

            }
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");

            }


            System.out.println();
        }
        for(int i=n; i>=1; i--){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");

            }
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");

            }


            System.out.println();
        }

         */

//         Case 2nd
        for(int i=1; i<=n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");

            }
            for(int j=1; j<=i; j++){
                System.out.print("*");

            }
            for(int j=2; j<=i; j++){

                System.out.print("*");

            }
            System.out.println();
        }
        for(int i=n; i>=1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");

            }
            for(int j=1; j<=i; j++){
                System.out.print("*");

            }
            for(int j=2; j<=i; j++){

                System.out.print("*");

            }
            System.out.println();
        }


    }
}
