package com.java.test;

class Sphere {

    int radius;
    float area;
    float volume;

    public void setRadius(int j) {
        this.radius = j;

    }

    public int getRadius() {
        return this.radius;
    }

    Sphere(int j) {
        this.radius = j;

    }

    //    Problem 2 = Calculate Surface area & Volume of cyclinder
//   Surface area formula=         A=4πr2
//    Volume of Sphere =         V=4/3πr3
    public float SurfaceArea() {
        area = 4 * (3.14f) * radius * radius;
        return this.area;
    }

    public float Volume() {
        volume = 1.33f * 3.14f * radius * radius * radius;
        return this.volume;
    }

    Sphere() {

    }


}


public class CWH44_Sphere_Practice_set_OOPS_Getter_Setter_CH_9 {
    public static void main(String[] args) {
//        System.out.println("Please give Value of Height & Radius");
//        Cylinder cy = new Cylinder();
//        cy.Radius = 2;
//        cy.height = 3;

        Sphere cy = new Sphere(12);
//        cy.getheight();
//        cy.getradius();

        System.out.println("Given Radius = " + cy.getRadius());
        System.out.println("Surface area of cylinder is " + cy.SurfaceArea());
        System.out.println("Volume of cylinder is  " + cy.Volume());


    }
}
