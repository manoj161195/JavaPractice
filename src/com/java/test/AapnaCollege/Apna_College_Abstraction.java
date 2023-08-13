package com.java.test.AapnaCollege;

abstract class Animal{

    public void walk(){

    }
}

class Horse extends Animal{
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
}

class chicken extends Animal{
    @Override
    public void walk (){
        System.out.println("Walk on 2 legs");
    }

        }



public class Apna_College_Abstraction {
    public static void main(String[] args) {

        Horse H1 = new Horse();
        H1.walk();

    }




}
