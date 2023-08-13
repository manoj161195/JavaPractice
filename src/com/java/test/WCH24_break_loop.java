package com.java.test;

public class WCH24_break_loop {
    public static void main(String[] args) {

//      For loop break
   /*     for (int i= 1; i<10; i++){
            System.out.println(i);

            if (i==8){

                System.out.println("Breaking current loop");
                break;
            }

        }
        System.out.println("For loop ends here"); */





//        While loop break
      /*  int i =0;
        while (i<10){
            System.out.println(i);
            i++;
            if(i==7) {
                System.out.println("Braking while loop");
                break;
            }
        }
        System.out.println("Loop ends here"); */



        int i =0;
        do {
            System.out.println(i);
            i++;

            if (i==4){
                System.out.println("Breaking do-while loop");
                break;
            }
        }while (i<10);
        System.out.println("Do-While loop end here ");



    }
}
