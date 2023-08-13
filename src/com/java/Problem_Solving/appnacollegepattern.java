package com.java.Problem_Solving;

public class appnacollegepattern {
    public static void main(String[] args) {
        int x = 1;
        int n = 5;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {

                int z = i + j ;

                if( z %2 ==0 ){
                    System.out.print("1 ");
                }else {
                    System.out.print("0 ");
                }


//                System.out.print(x + " ");

            }
            System.out.println();

        }
    }
}
