package com.java.test;

import java.util.Scanner;

public class CWH82_Practice_set_try_catch_in_WHILE_loop {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 41;
        marks[1] = 43;
        marks[2] = 46;
        boolean flag = true;
        while (flag) {
            System.out.println("You're array length is : " + marks.length + "   Index value should <! " + marks.length);

            System.out.println("Give index values");
            Scanner sc = new Scanner(System.in);
            int index = sc.nextInt();
            System.out.println("Give index value is : " + index);

            System.out.println("Give value used for divide");
            int div = sc.nextInt();
            System.out.println("Given value for devide is : " + div);


            try {
                System.out.println("This is 1st Level Try ");
                try {
                    System.out.println("This is 2nd level Try ");
                    flag = false;
                    flag = true;
                    try {
                        System.out.println("This is 3rd level Try Opration" + marks[index] / div);
                        flag = false;


                    } catch (ArrayIndexOutOfBoundsException AB) {
                        System.out.println("This is 3rd level Exception :" + AB);
                        System.out.println("This is 3rd level Catch");
                    }


                } catch (ArithmeticException AE) {
                    System.out.println("This is 2nd level catch :" + AE);
                    System.out.println("Please give value other than Zero for divide");
                }


            } catch (Exception e) {
                System.out.println("This is 1st level catch" + e);


            }
        }

        System.out.println("Loop is completed not a single error found : GOOD MAN");


    }
}
