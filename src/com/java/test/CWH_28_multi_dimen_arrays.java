package com.java.test;

public class CWH_28_multi_dimen_arrays {
    public static void main(String[] args) {

        int [][] flats = new int[3][5];
        flats [0][0]= 101;
        flats [0][1]= 102;
        flats [0][2]= 103;
        flats [0][3]= 104;
        flats [0][4]= 105;
        flats [1][0]= 201;
        flats [1][1]= 202;
        flats [1][2]= 203;
        flats [1][3]= 204;
        flats [1][4]= 205;
        flats [2][0]= 301;
        flats [2][1]= 302;
        flats [2][2]= 303;
        flats [2][3]= 304;
        flats [2][4]= 305;

//        Print 2D array now
//        Outer loop
        for (int i=0; i<flats.length; i++){
            for(int j=0; j<flats[0].length; j++){
                System.out.print(flats[i][j] + " ");


            }
            System.out.println();


        }



    }
}
