package com.java.test;

import java.util.Scanner;
class MaxRetry extends Exception{
    @Override
    public String toString() {
        return "Your Max Try limit is Reached";
    }
}

public class CWH86_PracticeSet_error_Exception {
    public static void main(String[] args) throws MaxRetry {
        boolean flag = true;
//        Condition if a is greate that 4
        int[] marks = new int[3];
        marks[0] = 1;
        marks[1] = 2;
        marks[2] = 3;
        int index;
        int a = 0;
        Scanner sc = new Scanner(System.in);
//        System.out.println("Please give value of a");

        while (flag && a < 5) {

            try {
                System.out.println("Please give index value ");
                index = sc.nextInt();

                System.out.println("Value of index is Marks[Index] : " + marks[index]);
                break;


            } catch (Exception e) {
                System.out.println("Invalid input : " + e);
                a++;

            }
        }
        if (a >= 4) {
            System.out.println("Give input is wrong Grater than expected : " + a);
            throw new MaxRetry();
        }
    }


}
