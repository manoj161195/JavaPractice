package com.java.test;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CBSCmarksTask {

    public static void main(String[] args){
        System.out.println("Give marks out of how much");
        Scanner OF = new Scanner(System.in);
        float O = OF.nextFloat();
        float d = O * 5;
//        System.out.println(d);
//        Out of marks taken

        System.out.println("Marks in 1st subject");
        float A = OF.nextFloat();

        System.out.println("Marks in 2nd subject");
        float B = OF.nextFloat();

        System.out.println("Marks in 3rd subject");
        float C = OF.nextFloat();

        System.out.println("Marks in 4th subject");
        float D = OF.nextFloat();

        System.out.println("Marks in 5th subject");
        float E = OF.nextFloat();

//        Add all subject inputs
        float sum = A + B + C + D + E;
//        System.out.println(sum);
//        Divide sun with O or multiply with 0.01
        System.out.print("Percentage is =");
        float T = sum/d;
//        System.out.println(T);
        float Per = T * 100;
        System.out.print(Per);
        System.out.println("%");

    }

}
