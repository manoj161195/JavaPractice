package com.java.test;

import java.sql.SQLOutput;

public class CWH27_IMP_arrays_operation_with_for_each_loop {
    public static void main(String[] args) {
        int[] marks = {1, 2, 3, 4, 5};

//        Using For loop
//        Array reverse
        System.out.println("Array in reverse way");
        for (int i = marks.length - 1; i >= 0; i--) {
            System.out.println(marks[i]);
        }

        System.out.println("Array in forward way ");


//        array forward way
        for (int i = 0; i< marks.length; i++){
            System.out.println(marks[i]);

        }


        System.out.println("For Each Loop operation start here");
//        For Each loop operation

        for (int part: marks){
            System.out.println(part);
        }





    }
}
