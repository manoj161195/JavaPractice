package com.java.test;

import java.util.Scanner;

class NewException extends Exception{

    @Override
    public String getMessage() {
        return "This is new class getMessage string ";
    }

    @Override
    public String toString() {
        return "This is toString of new class value";
    }
}

public class CWH_83_Throw_Custome_Exception {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please give in put");
        int a = sc.nextInt();
        if (a<10){
            try {
//                throw new NewException();
                throw new  ArithmeticException("Good Manoj");
            }catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e.getStackTrace());



            }
            System.out.println("Loop is finished");

        }

    }
}
