package com.java.Problem_Solving;

public class appnacollegePatternHomeWork_SolidRhombus {

//       *****
//      *****
//     *****
//    *****
//   *****
    public static void main(String[] args) {


        int n=5;

        for(int i=0; i<n; i++){

            for(int j=1; j<n-i; j++ ){
                System.out.print(" ");

            }

//             One possibility to print stars (My thinking)
            /*

            for (int j=0; j<=i; j++ ){

                System.out.print("*");

            }
            for(int j=1; j<n-i; j++) {
                System.out.print("*");

            }

             */


//            Second possiblity to print stars (Video tric)
            for(int j=1; j<=n; j++){
                System.out.print("*");

            }
            System.out.println();

        }

    }
}
