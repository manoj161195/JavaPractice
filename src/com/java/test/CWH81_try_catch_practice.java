package com.java.test;

import java.util.Scanner;

public class CWH81_try_catch_practice {
    public static void main(String[] args) {
        int [] marks = new int[3];
        marks[0] =20;
        marks[1] =13;
        marks[2] =30;
        System.out.println("Give index value which you wants to used to nominator");
        Scanner sc = new Scanner(System.in);
        int indx = sc.nextInt();

        System.out.println("Selected index is : "+ indx);

        System.out.println("Add value which you want to used in dinominator");
        int din = sc.nextInt();
        System.out.println("Give dinominator is : " + din);


        try{
            System.out.println("Vaule of dividation is : " + marks[indx]/din);
            System.out.println("This is try condition");


        }catch (ArithmeticException AE ){
            System.out.println("This is Arithmetic  EX :   "+ AE);
        }catch (ArrayIndexOutOfBoundsException AOB){
            System.out.println("This is Array O Bounds" + AOB);
        }catch (Exception e){
            System.out.println("This is Other Exception : " + e);
        }





    }
}
