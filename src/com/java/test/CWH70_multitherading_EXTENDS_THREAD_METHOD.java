package com.java.test;

class client1 extends Thread {
    public void run() {
        int i = 0;
        while (i < 30) {
            System.out.println("Taking Clinet 1 working ");
            i++;
        }
    }
}

class client2 extends Thread {
    public void run() {
        int i = 0;
        while (i < 30) {
            System.out.println("Taking Clinet 2 working ");
            i++;
        }
    }
}

class client3 extends Thread {
    public void run() {
        int i = 0;
        while (i < 30) {
            System.out.println("Taking Clinet 3 working ");
            i++;
        }
    }
}


public class CWH70_multitherading_EXTENDS_THREAD_METHOD {
    public static void main(String[] args) {

        client1 c1 = new client1();
        client2 c2 = new client2();
        client3 c3 = new client3();

        c1.start();
        c2.start();
        c3.start();


    }


}
