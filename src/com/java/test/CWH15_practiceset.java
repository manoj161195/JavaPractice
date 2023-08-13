package com.java.test;

public class CWH15_practiceset {
    public static void main(String[] args) {
//        Problem 1
        String name = "GOOD manoj";
        System.out.println(name.toLowerCase());

//        Problem 2
        char c = '_';

        name = name.replace(' ', c);
        System.out.println(name);

//        Problem 5
        String harry = "Hi harry, this videos are good. thank you";
        System.out.println("Hi \'harry\',\n this videos are good \n \"thank you\" ");

        harry = harry.replace(' ', '@');

        System.out.println(harry);
//        Problem 3
        String run = "hi <|name|>, Please to stop it going     good";

        run = run.replace("<|name|>", "Manoj");
        System.out.println(run);

//        Problem 4 detect 2-3 spaces from string
        System.out.println(run.indexOf(" "));
        System.out.println(run.indexOf("  "));
        System.out.println(run.indexOf("   "));
        System.out.println(run.indexOf("         "));

    }
}
