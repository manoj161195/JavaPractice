package com.java.test;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CWH82_Nested_Try_Catch {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 25;
        marks[1] = 27;
        marks[2] = 31;

        System.out.println("Give index input below ");
        Scanner sc = new Scanner(System.in);
        int indx = sc.nextInt();
        System.out.println("Given input is : " + indx);

        System.out.println("Give value you what to used for dividation");
        int div = sc.nextInt();
        System.out.println("Given input for divide : " + div);


        try {
            System.out.println("This is level 1st lable");
            try {

                System.out.println("Value of dividation is : " + marks[indx] / div);

            } catch (ArrayIndexOutOfBoundsException AOBE) {
                System.out.println("Array is out of index :" + AOBE);
                System.out.println("This is level 2 catch");
            }


        } catch (Exception e) {
            System.out.println("This is Level 1st Exception " + e);
        }


    }
}
