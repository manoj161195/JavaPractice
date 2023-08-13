package com.java.test;

class Car {
    String Fueltype;
    String Company;
    int avag;

    public void drive() {
        System.out.println("Good Long Drive Started");
        System.out.println("Check Fule & \"Check AVG\"");
    }

    public void allinfo() {
        System.out.println("Made by " + this.Company);
        System.out.println("For 1 liter = " + this.avag + "KM");
        System.out.println("Please check " + this.Fueltype);
    }


}

public class OOPS_with_APNA_College {
    public static void main(String[] args) {
        System.out.println("Car 1");
        Car c1 = new Car();
        c1.avag = 10;
        c1.Company = "Maruti";
        c1.Fueltype = "CNG";


        Car c2 = new Car();
        c2.Fueltype = "Petrol";
        c2.Company = "Honda";
        c2.avag = 8;


        c1.drive();
        c1.allinfo();
        System.out.println("Car 2 ");
        c2.drive();
        c2.allinfo();


    }
}
