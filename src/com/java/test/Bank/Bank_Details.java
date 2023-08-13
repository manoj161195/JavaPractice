package com.java.test.Bank;


class bank {
    public String name;
    protected String email;
    private String password;

    public void printinfo() {
        System.out.println(this.name);
        System.out.println(this.email);


    }

    //    Getters & Setters
    public String getpassword() {
        return this.password;
    }

    public void setPassword(String pass) {
        this.password = pass;
    }


}


public class Bank_Details {
    public static void main(String[] args) {
        bank account1 = new bank();
        account1.name = "Manoj1";
        account1.email = "manoj1@gmail.com";
        account1.setPassword("abcd");


        account1.printinfo();
        System.out.println(account1.getpassword());


    }


}