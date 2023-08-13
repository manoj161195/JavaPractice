package com.java.ScRushi;

import java.util.Scanner;

public class PatternProblem {
    public static void main(String[] args) {


//      First Pattern Problem
        /*
//         Simple method
           int n = 5;

//        for (int i = 1; i <= n; i++) {

           for (int j = 1; j<= i; j++) {
                if(j==2 || j==4){
                    System.out.print(j);
                }else {
                    System.out.print(" * ");
                }


            }
            System.out.println();

 */

//        Pattern print star & Even number patthern.
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Give value for N ");

        int n = sc.nextInt();
        for (int i=1; i<=n; i++){

            for (int j=1; j<=i; j++ ){

                if (j%2!=0){
                    System.out.print(j);

                }else {
                    System.out.print(" * ");
                }

            }
            System.out.println();

         */

        int n =5;
        for(int i=0; i<n; i++){

            for (int j=0; j<n; j++){
                if(j==0 || j==n-1){
                    System.out.print(" * ");

                }else {
                    System.out.print(" _ ");
                }
            }
            System.out.println();




        }

        }


    }

//}


//}



