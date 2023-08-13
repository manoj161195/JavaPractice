package com.java.Problem_Solving;

public class PyramidPattern {
    public static void pyramidPattern(int n) {
        for (int i = 0; i < n; i++) //outer loop for number of rows(n) { for (int j=n-i; j>1; j--) //inner loop for spaces
        {
            System.out.print(" "); //print space
        }
        for (int j = 0; j <= n; j++) //inner loop for number of columns
        {
            System.out.print("* "); //print star
        }

        System.out.println(); //ending line after each row
    }

    public static void main(String args[]) //driver function
    {
        int n = 5;
        pyramidPattern(n);
    }
}

//    static void pyramidp(int n) {
//
//        for (int i = 0; i < n; i++) {
//            System.out.print(" ");
//            for (int j = 0; j <= i; j++) {
//                System.out.print("* ");
//
//            }
//            System.out.println();
//        }
//        System.out.println();
//    }
//
//
//    public static void main(String[] args) {
//        pyramidp(8);
//
//    }


