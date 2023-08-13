package Java_Brush_Up.test;

import java.util.Scanner;

public class If_Else_nested_loop {
    public static void main(String[] args) {
//        Blood donation drive sort users according to Age & Weight condition.
        int age;
        int weight;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your Age");
        age = sc.nextInt();
        System.out.println("Please enter your Weight");
        weight = sc.nextInt();


        if (age>=18 && age<60){
            System.out.println("Age =" + age);
            if(weight<50){
                System.out.println("person is under weight");

            } else if (weight==60) {
                System.out.println("Please do HB test & weight is =" + weight );
            } else if (weight>60) {
                System.out.println("Good you can donate blood");
            }

        } else if (age<18) {
            System.out.println("Person is under age");
        } else if (age>=60) {
            System.out.println("Your Weight is = " + age);
            if(weight<50){
                System.out.println("Old SC under weight");

            } else if (weight==60) {
                System.out.println("Old SC do BP, HB  test & weight is =" + weight );
            } else if (weight>60 && weight<80) {
                System.out.println("Old SC with over weight");
            } else if (weight>80) {
                System.out.println("Please go home age =" + weight);

            }

        }
    }
}
