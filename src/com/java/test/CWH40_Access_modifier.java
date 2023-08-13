package com.java.test;

import java.util.*;
class MyEmploy {
    private int id;
    private String Name;


    public int getid() {
        return id;
    }

    public void Setid(int i) {

        id = i;
    }

    public String getName() {
        return this.Name;
    }
    public void SetName(String x){
        Name =x;

    }


}


public class CWH40_Access_modifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Please give id number");

        MyEmploy E1 = new MyEmploy();
        E1.Setid(3);
        E1.SetName("Manoj1");

        System.out.println(E1.getid());
        System.out.println(E1.getName());



    }


}
