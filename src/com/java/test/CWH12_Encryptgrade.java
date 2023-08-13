package com.java.test;

public class CWH12_Encryptgrade {
    public static void main(String[] args) {
//        float A = 7/4.0f*9/2.0f;
//        System.out.println(A);

        char grade = 'D';
        grade = (char) (grade + 5);

        System.out.println(grade);
//        Decrypt code

        grade = (char) (grade - 5);
        System.out.println(grade);


    }


}
