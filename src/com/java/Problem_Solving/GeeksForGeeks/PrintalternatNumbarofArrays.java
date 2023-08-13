package com.java.Problem_Solving.GeeksForGeeks;

public class PrintalternatNumbarofArrays {
    public static void main(String[] args) {


        int [] ab = {1,2,3,4};
        for(int i=0; i<ab.length; i++){

            if(ab[i]%2==0){
                continue;
            }else {
                System.out.print(ab[i] + " ");
            }

        }

    }
}
