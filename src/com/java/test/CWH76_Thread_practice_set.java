package com.java.test;

class c1 extends Thread {
    public void run() {
        int i = 0;
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        while (i < 200)        {
            System.out.println("Good Morning ");
            i++;

        }

    }

}

class c2 extends Thread {
    int j = 0;

    public void run() {
        while (j < 200) {
            System.out.println("Welcome ");
            j++;
        }
    }


}


public class CWH76_Thread_practice_set {
    public static void main(String[] args) {
        c1 c = new c1();
        c2 c2 = new c2();


//        c.setPriority(9);
//        c2.setPriority(7);


        c.start();
        c2.start();
        System.out.println(c.getPriority());
        System.out.println(c2.getPriority());


    }


}
