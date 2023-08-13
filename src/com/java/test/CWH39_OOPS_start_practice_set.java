package com.java.test;


// Code with Harry first problem.


class employe{
    String name;
    int salary;


    public void getname(){
        System.out.println("Name is =" + this.name);
    }
    public void getsalary(){
        System.out.println("You Current salary = " + this.salary);
    }
    public String getName(){

        return this.name;
    }
    public void setName(String pass){
        this.name = pass;
    }


}


public class CWH39_OOPS_start_practice_set {
    public static void main(String[] args) {

        employe E1 = new employe();

        E1.salary = 100;
        E1.setName("XMAN");

        E1.getname();
        E1.getsalary();

    }
}
