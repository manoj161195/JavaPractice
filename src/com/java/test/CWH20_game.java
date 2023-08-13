package com.java.test;

import javax.xml.transform.Source;
import java.sql.SQLOutput;
import java.util.*;

public class CWH20_game {
    public static void main(String[] args) {
        System.out.println("Lets Play Stone, Paper & Scissor Game \n Please give values according to assing term \n 0 = Rock \n 1 = Paper \n 3 = Scissor ");
//        0 = Rock;
//        1 = Paper;
//        2 = Scissor;
        System.out.println("Please give your input");
        Scanner sc = new Scanner(System.in);
        int Userinput = sc.nextInt();

        Random Cominput = new Random();
        int Computerinput = Cominput.nextInt(3);

        if (Userinput == Computerinput) {
            System.out.println("Draw");

        } else if (Userinput == 0 && Computerinput == 2 || Userinput == 1 && Computerinput == 0 || Userinput == 2 && Computerinput == 1)
        {
            System.out.println("YOU WIN");

        } else {
            System.out.println("COMPUTER WIN");
        }
//        System.out.println("Computer Input : "+ Computerinput);
        if (Computerinput==0){
            System.out.println("Computer Choice = ROCK");

        } else if (Computerinput==1) {
            System.out.println("Computer Choice = PAPER");
        } else if (Computerinput==2) {
            System.out.println("Computer Choice = SCISSOR");
        }
    }


    }

