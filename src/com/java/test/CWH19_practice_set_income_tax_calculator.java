package com.java.test;

import java.util.Scanner;

public class CWH19_practice_set_income_tax_calculator {
    public static void main(String[] args) {
//        Problem 2  A person marks (user input)
//      Scanner sc = new Scanner(System.in);
   /*     System.out.println("Add marks of Subject 1");
        float s1= sc.nextFloat();
        System.out.println("Add subject 2 marks");
        float s2 = sc.nextFloat();
        System.out.println("Add subject 3 marks");
        float s3= sc.nextFloat();

        float avg = (s1+s2+s3)/3.0f;

        if (avg>=40 && s1>=33 && s2>=33 && s3>=33 ){
            System.out.println("Person is passed");

        } else if (avg==40 && s1==33 && s2==33 && s3==33) {
            System.out.println("Just pass");

        } else {
            System.out.println("User is not passed");
        }
        System.out.println("Your % is="  +avg);*/

//        Problem set 3

        System.out.println("Please Add you're income in lakhs");
        Scanner sc = new Scanner(System.in);
        float pack = sc.nextFloat();
        float tax = 0;


        if (pack < 2.5f) {
            tax = tax + 0;

        } else if (pack > 2.5f && pack < 5.0f) {

            tax = tax + 0.05f * (pack - 2.5f);

        } else if (pack > 5.0f && pack < 10.0f) {
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (pack - 5.0f);

        } else if (pack>10.f) {
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (10.0f - 5.0f);
            tax = tax + 0.2f * (pack - 10.0f);
        }

        System.out.println("Income tax on you're package is ="+ tax);


    }


}
