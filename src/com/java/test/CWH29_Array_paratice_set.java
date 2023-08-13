package com.java.test;

public class CWH29_Array_paratice_set {
    public static void main(String[] args) {
//        Sum of arrays
//        PROBLEM 1

      /*  int []marks = {1,2,3,4,5};
        int sum = 0;

        for (int man :marks){

            sum = sum + man;

        }
        System.out.println("Arrys value \n " +  sum);

       */


//        Problem 2(Please check this not working as expecetd)
       /* float [] marks = {11.1f, 22.1f, 10.1f,12.1f};
        float num =  22.1f;

        boolean isInArray= false;

        for (float element : marks) {
            if(num==element){

                isInArray =true;
                break;

            }
            if(isInArray){
                System.out.println("Present in array");
            }else {
                System.out.println("Not present in arrays");       */

//        Problem Set 3

        float[] marks = {10.0f, 12.0f, 11.0f};
        float sum = 0;
        for (float x : marks) {
            sum = sum + x;

        }
        System.out.println("Avarage of marks is = " + sum / marks.length);




//        Problem 4 write code for 2d array & add it

        int [][] a = {          {1,2,3,4},
                                 {4,3,2,1}};
        int [][] b = { {2,3,4,5},
                       {5,4,3,2} };
        int [][] c= { {0,0,0,0},
                      {0,0,0,0} };







    }

}

        


