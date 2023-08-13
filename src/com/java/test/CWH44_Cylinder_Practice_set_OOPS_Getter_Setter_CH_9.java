package com.java.test;

class Cylinder {
    private int height;
    private int Radius;
    float Area;
    float Volume;

    //    Problem 1 = use Getters & Setters to set height & radius
    public int getheight() {
        return this.height;
    }

    public void setheight(int i) {
        this.height = i;
    }

    public void setRadius(int j) {
        this.Radius = j;

    }

    public int getRadius() {
        return this.Radius;
    }

    Cylinder(int i, int j) {
        this.height = i;
        this.Radius = j;


    }

    //    Problem 2 = Calculate Surface area & Volume of cyclinder
//   Surface area formula=         A=2πrh+2πr*r
//    Volume of Cylinder =         V=πr*rh
    public float SurfaceArea() {
        Area = 2 * (3.14f) * Radius * height + 2 * (3.14f) * Radius * Radius;
        return this.Area;
    }

    public float Volume() {
        Volume = 3.14f * Radius * Radius * height;
        return this.Volume;
    }

    Cylinder() {

    }


}


public class CWH44_Cylinder_Practice_set_OOPS_Getter_Setter_CH_9 {
    public static void main(String[] args) {
        System.out.println("Please give Value of Height & Radius");
//        Cylinder cy = new Cylinder();
//        cy.Radius = 2;
//        cy.height = 3;

        Cylinder cy = new Cylinder(12,12);
//        cy.getheight();
//        cy.getRadius();

        System.out.println("Given Height = " + cy.getheight());
        System.out.println("Given Radius = " + cy.getRadius());
        System.out.println("Surface area of cylinder is " + cy.SurfaceArea());
        System.out.println("Volume of cylinder is  " + cy.Volume());


    }
}
