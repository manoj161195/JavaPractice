package com.java.test;


class man1 extends Thread {


    public man1(String name) {
        super(name);
    }

    public void run() {
        System.out.println("This is object : " + this.getName());

    }
}

    class man2 extends Thread{


        public man2 (String name){
            super(name);
        }
        public void run(){
            System.out.println("This is object : " +this.getName() );

        }


}




public class CWH73_thread_practice {
    public static void main(String[] args) {

        man1 m1 = new man1("Manoj");
        man1 m2 = new man1("MAnoj2");
        man1 m3 = new man1("MAnoj3");
        man1 m4 = new man1("MAnoj4");





        m1.start();
        m2.start();
        m2.start();
        m3.start();
        m4.start();



    }
}

