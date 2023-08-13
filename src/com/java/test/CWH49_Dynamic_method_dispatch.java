package com.java.test;

class Phone{

    public void Showtime(){
        System.out.println("12 PM");
    }
    public void on(){
        System.out.println("Old phone is getting on");
    }

}
class SmartPhone extends Phone{
    public void Music(){
        System.out.println("Playing");
    }

    public void on(){
        System.out.println("Smart phone is getting on.............");
    }
}

public class CWH49_Dynamic_method_dispatch {
    public static void main(String[] args) {
//        System.out.println("Old Phone object call");
//        Phone pp = new Phone();
//        pp.on();


        System.out.println("Old calss new phone object ");

        Phone P1 = new SmartPhone();
        P1.on();

        System.out.println("New phone object call");

        SmartPhone S1 = new SmartPhone();
        S1.Showtime();
        S1.Music();
        S1.on();





    }
}
