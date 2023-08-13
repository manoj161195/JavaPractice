package com.java.ScRushi;

import java.util.Scanner;

public class Take2D_array_input_print2D_array_practice {





    public static void main(String[] args) {

        System.out.println("Give I/P for M & N ");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int x [][] = new int [m][n];

        for(int i=0; i<m; i++){

            for(int j=0; j<n; j++){
                x[i][j]= sc.nextInt();
            }
            System.out.println();

        }

        System.out.println("Value of m is " + m);
        System.out.println("Value of N is " + n);

        for(int i=0; i<m; i++){

            for(int j=0; j<n; j++){
                System.out.print(x[i][j] + " ");
            }
            System.out.println();

        }










    }
}
