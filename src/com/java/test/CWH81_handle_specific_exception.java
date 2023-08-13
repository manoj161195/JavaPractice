package com.java.test;

import java.util.Scanner;

public class CWH81_handle_specific_exception {
    public static void main(String[] args) {

        int[] marks = new int[3];
        marks[0] = 10;
        marks[1] = 1;
        marks[2] = 100;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter index of array ");
        int indx = sc.nextInt();

        System.out.println("Give number which you want to used to divide ");
        int num = sc.nextInt();

        System.out.println("Value of index is : " + indx);
        System.out.println("Number give is : " + num);
        try {
            System.out.println("Value of marks int / number is : " + marks[indx] / num);


        } catch (ArrayIndexOutOfBoundsException A) {
            System.out.println("This is Array out of bond exception : " + A);

//            System.out.println("Loop ends here");
        }
        catch (ArithmeticException e){
            System.out.println("This is arithmetic exception : "+ e);
        }
        catch (Exception o){
            System.out.println("This is new type of exception " + o);
        }





    }
}
// ArrayIndexOutOfBoundsException
// ArithmeticException