package com.java.test;


class client11 implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (i < 200) {
            System.out.println("Client 1 method running");
            i++;
        }

    }
}

class client12 implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (i < 200) {
            System.out.println("Client 2 method running");
            i++;
        }
    }
}

public class CWH71_MULTITHEADING_implement_runRunaable_interface {
    public static void main(String[] args) {
        client11 bullet1 = new client11();
        Thread gun1 = new Thread(bullet1);

        client12 bullet2 = new client12();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}
