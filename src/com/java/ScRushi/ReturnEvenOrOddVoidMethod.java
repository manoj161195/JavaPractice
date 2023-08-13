package com.java.ScRushi;

import java.util.Scanner;

public class ReturnEvenOrOddVoidMethod {

    static void numtype(int n){
        if(n%2==0 && n!=1 && n!=0){
            System.out.println("Number is Even");
        } else if (n%2==0 && n==1) {
            System.out.println("Not E & Not O = 1 is nutral");
        } else if (n%2==0 && n==0) {
            System.out.println("0 nutral number");

        } else if (n%2!=0 && n!=1){
            System.out.println("Number is odd");
        }
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give input ");
        int z = sc.nextInt();

       numtype(z);

    }
}
