package com.java.Problem_Solving;

import java.util.Scanner;

public class test2 {

    public static void parray (int [] arry){
        int row = arry.length;

        for(int i=0; i< arry.length; i++ ){

            System.out.print(arry[i] + " ");

        }

    }
    public static void Rarray (int [] arry){
        int row = arry.length;

        for(int i= arry.length; i> 0; i-- ){

            System.out.print(arry[i] + " ");

        }

    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int x [] = new int [N];

        for (int i=0; i<N; i++){
            x[i]= sc.nextInt();
        }

        parray(x);











    }

//    2 D array taking input from user & Printing array.
//    public static void printarray(int [][] arry){
//
//        int Row = arry.length;
//        int Col = arry[0].length;
//
//        for(int i=0; i< arry.length; i++ ){
//
//            for(int j=0; j<arry[0].length; j++){
//                System.out.print(arry[i][j] + "  ");
//
//            }
//            System.out.println();
//
//        }
//
//
//    }
//
//
//
//
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please give value for Row");
//        int Row = sc.nextInt();
//        System.out.println("Please give value for Col");
//
//        int Col = sc.nextInt();
//
//        int [][] xyz = new int[Row][Col];
//
//        System.out.println("Give input for array values");
//
//
//        for(int i=0; i<Row; i++){
//
//            for(int j=0; j<Col; j++){
//                xyz [i][j] = sc.nextInt();
//
//            }
//            System.out.println();
//
//        }
//
//
//        System.out.println("Your New array is following");
//
//        printarray(xyz);
//
//    }
}
