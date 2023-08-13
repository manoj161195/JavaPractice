package com.java.ScRushi;

import java.util.Scanner;

public class Take2D_array_input_print2D_array {

    public static void printarray(int[][] array) {

        int row = array.length;
        int col = array[0].length;

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < col; j++) {
                System.out.print(array[i][j] + "  ");


            }
            System.out.println();

        }


    }


    public static void main(String[] args) {
        System.out.println("Give N & M value");

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] TwoD = new int[n][m];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {
                TwoD[i][j] = sc.nextInt();

            }
            System.out.println();

        }

        printarray(TwoD);


    }
}
