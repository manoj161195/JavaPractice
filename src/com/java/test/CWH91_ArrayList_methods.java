package com.java.test;

import java.util.ArrayList;

public class CWH91_ArrayList_methods {
    public static void main(String[] args) {
        ArrayList<Integer> l1 ;
             l1   = new ArrayList<Integer>();
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
//        l1.add(3);
//        l1.add(3);
//        l1.add(3);
        System.out.println("Old Array list" + l1);

        int i =0;
        l1.add(0,100);
        l1.add(1,200);
        l1.add(2,300);
        l1.add(3,400);
        l1.add(4,500);
        l1.add(5,600);
        System.out.println("New ArrayList : " +l1);

        System.out.println(l1.get(6));
        System.out.println(l1.indexOf(5));
//        l1.remove(2);
//        System.out.println("Array after removal : " + l1 );

//        for (i=0; i<l1.size(); i++){
//            l1.remove(i);
//            System.out.println("Array after removal : " + l1 );
//        }
        l1.subList(3, 6);
        System.out.println("Sub list : " + l1);

        System.out.println("New set values Array  " +   l1.set(0,10000));

        System.out.println("Array size : " + l1.size());
        System.out.println( l1.isEmpty());
        System.out.println("New Clone list " + l1.clone());


//        Date d = new Date();
//        System.out.println(d.getTime()/1000/3600/24/365);
//        System.out.println(d.getDate());
//        System.out.println(d.getYear());



//        for(i = 0; i<l1.size(); i++){
//            System.out.print("Array contains this values :  " + l1);
//            System.out.println(" , ");
//        }

    }
}
