package com.java.test;

class Animal1 {
    String Name;

    public void Walk() {
        System.out.println("Walk on 4 legs");

    }
//    Animal1(){
//        System.out.println("Empty First Animal Constructor");
//
//    }
//   public Animal1(int x){
//        System.out.println("First Animal Constructor value = " +x);
//
//    }

}

class food extends Animal1 {


    public void Eat() {
        System.out.println("Eat Non-Veg");
    }
//    food(){
//        System.out.println("2nd Food empty constructor");
//    }
//    public food(int x, int y){
//        super(x);
//        System.out.println("2nd Food constructor value = "+y);
//    }
}

class Dog extends food {

    public void Speak() {
        System.out.println("On commands they can bark");
    }
//    Dog(){
//        System.out.println("3rd Dog empty constructor");
//    }
//    Dog(int x, int y, int z){
//        super(x,y);
//        System.out.println("3rd Dog constructor = "+ z);
//    }
}

public class CWH_45_Inheritance {
    public static void main(String[] args) {

        Dog D1 = new Dog();
        D1.Walk();
        D1.Eat();
        D1.Speak();


//   All constructors are disable you can enable when you what it.
    }
}
