package com.java.ScRushi;

import java.util.Scanner;

public class Take2D_array_pract {

    public static void printarray(int[][] array) {
        int row = array.length;
        int col = array[0].length;

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < col; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();


        }

    }


    public static void main(String[] args) {
        System.out.println("Please give value for M & N");
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println();
        int Q[][] = new int[m][n];


        for (int i = 0; i < Q.length; i++) {
            for (int j = 0; j < Q[0].length; j++) {

                Q[i][j] = sc.nextInt();

            }
            System.out.println();

        }
        printarray(Q);


    }
}
