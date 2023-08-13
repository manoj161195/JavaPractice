package Java_Brush_Up.test;

import java.util.Scanner;

public class If_else_if {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter value for A");
        int a = sc.nextInt();
        System.out.println("Value of A is = " + a);


        System.out.println("Please enter value for B");
        int b = sc.nextInt();
        System.out.println("Value of B is = " + b);
        
       /* if (a>5){
            System.out.println("A is greate than 5");
            
        } else if (a==5) {
            System.out.println("A is equal to 5");
        } else if (a<5) {
            System.out.println("A is smaller that 5");
        }
        System.out.println("Loop is ended");

        */
        int c = a + b;

        if(c>=20){
//            System.out.println("Value of C is = " + c);
            System.out.println("C is greater that 20");
        }else {
//            System.out.println("Value of C is = " + c);
            System.out.println("C is smaller that 20");
        }
        System.out.println("Value of C is = " + c);

        System.out.println("Loop is ended");
    }
    
}
