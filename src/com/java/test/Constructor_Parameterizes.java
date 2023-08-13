package com.java.test;

class Car1 {
    String Name;
    int avg;

    public void drive() {
        System.out.println("Good Long Drive Started");
        System.out.println("Check Fule & \"Check AVG\"");
    }

    public void allinfo() {
        System.out.println("1 liter = " + this.avg);
        System.out.println("Car Name " + this.Name);
    }


    //    /*  EMPTY CONSTRUCTOR
    Car1() {
        System.out.println("Empty Constructior");
    }


    /*  PARAMETERIZED Constructor


    Car1(String Name, int avg){
       this.Name = Name;
        this.avg = avg;
      }*/


    Car1(Car1 s1) {
        this.avg = s1.avg;
        this.Name = s1.Name;

    }

}

class man extends Car1 {

}


public class Constructor_Parameterizes {
    public static void main(String[] args) {
        System.out.println("Car 1");
        Car1 c1 = new Car1();
        c1.Name = "Old Car";
        c1.avg = 100;
        System.out.println("NEW Car info");
        c1.allinfo();


        System.out.println("Copyed Car Info ");
        Car1 S2 = new Car1(c1);
        S2.allinfo();


//        c1.drive();
//        c1.allinfo();


    }
}


