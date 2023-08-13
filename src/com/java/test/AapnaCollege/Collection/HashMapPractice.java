package com.java.test.AapnaCollege.Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapPractice{
    public static void main(String[] args) {

        HashMap<Integer,String> map=new HashMap<Integer,String>();



        map.put(1,"aa");
        map.put(2,"bb");
        map.put(3,"cc");
        map.put(4,"dd");
        map.put(5,"ee");

        System.out.println(map);


        System.out.println(map.get(10) );


        System.out.println(map.containsValue("aa"));
        System.out.println(map.containsKey(3));


//         Printing or itrating HashMap
//        Method 1 : Via Set


        Set<Integer> li = map.keySet();

        for(Integer ele : li){
            System.out.println(ele +"  " + map.get(ele));
        }

//        Method 2

        for(Map.Entry<Integer,String>e : map.entrySet()){
            System.out.println(e);
        }













    }
}
