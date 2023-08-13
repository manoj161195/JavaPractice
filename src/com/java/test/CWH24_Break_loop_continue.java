package com.java.test;

public class CWH24_Break_loop_continue {
    public static void main(String[] args) {
     /*   for (int i = 0; i < 10; i++) {

            if (i == 3) {
                System.out.println("Value of 3 will be skipped");
                continue;
            }
            System.out.println(i);
            System.out.println("Going Good");

        }
        System.out.println("Main for loop stop here");*/


//        Do while loop
        /*int i =1;
        do {

            i++;
            if(i==7){
                System.out.println("this 7 value will be skipped");
                continue;
            }

            System.out.println(i);
            System.out.println("Good Man");


        }while(i<10); */


//        while loop
        int i = 0;
        while(i<10) {

            i++;
            if (i == 7) {
                System.out.println("this 7 value will be skipped");
                continue;
            }

            System.out.println(i);
            System.out.println("Good Manoj");


        }


    }
}
