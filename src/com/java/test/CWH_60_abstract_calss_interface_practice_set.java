package com.java.test;


// Problem 1
/*abstract class pen {
    abstract void write();

    abstract void refill();
}

class foundationPen extends pen {
    public void ChangeNib() {
        System.out.println("Changing Nib");
    }
@Override
    public void write() {
        System.out.println("Writing..");
    }
@Override
    public void refill() {
        System.out.println("Refilling....");
    }


}


public class CWH_60_abstract_calss_interface_practice_set {
    public static void main(String[] args) {
        pen p1 = new foundationPen();
        p1.refill();
        p1.write();

        foundationPen fp1 = new foundationPen();
        fp1.ChangeNib();
        fp1.refill();
        fp1.write();

    }
}*/


// Problem 4 Telephone class

/*
abstract class telephone{

    abstract void ring();
    abstract void lift();
    abstract void disconnect ();}
class smartPhone1 extends telephone{
    public void ring(){
        System.out.println("Ringing......");
    }
    public void lift(){
        System.out.println("lifting......");
    }
    public void disconnect(){
        System.out.println("Disconnecting......");
    }
    public void check(){
        System.out.println("Checking........");
    }
    }


public class CWH_60_abstract_calss_interface_practice_set{
    public static void main(String[] args) {
        telephone tp = new smartPhone1();
        tp.disconnect();
        tp.lift();
        tp.ring();

        System.out.println("Polymorphism...........done");
    }
}*/


// Problem 6 - 7
interface smartTvRemote{

}
interface TVremote extends smartTvRemote{

}

class tv implements TVremote{

}

public class CWH_60_abstract_calss_interface_practice_set{
    public static void main(String[] args) {

    }

}


