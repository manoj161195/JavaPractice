package com.java.test;

// Area & volume of both
// Set getters & setters
//
//
//
//
//
class Rectangle {
    int Length;
    int Width;

    //    Getters & Setters for W & L
    public void setLength(int x) {
        this.Length = x;
    }

    public int getLength() {
        return this.Length;
    }

    public void setWidth(int w) {
        this.Width = w;
    }

    public int getWidth() {
        return this.Width;
    }

    int Area;

    public void shape() {
        System.out.println("This is rectangle");
    }

    //    Area formula A= wl
    public float Area() {
        this.Area = this.Length * this.Width;
        return this.Area;

    }


}

class cuboid extends Rectangle {
    int height;


    //    Getters & Setters for height
    public void setHeight(int h) {
        this.height = h;
    }

    public int getHeight() {
        return this.height;
    }

    public void cshape() {
        System.out.println("This is cuboid shape");
    }
//    int Area1;
//    public float Area1() {
//        this.Area1 = this.Length * this.Width  * this.height;
//        return this.Area1;
//
//    }
//
//     Formula V= whl
    int Volume1;
    public float Volume1() {
        Volume1 = this.Width * this.height * this.Length;
        return this.Volume1;
    }



}


public class CWH_52_Practice_set_rectangel_cuboid_features {
    public static void main(String[] args) {

        cuboid cb = new cuboid();
        cb.setHeight(55);
        cb.setLength(10);
        cb.setWidth(90);

//        cb.getHeight();
//        cb.getLength();
//        cb.getWidth();


        System.out.println(cb.getHeight());
        System.out.println(cb.getLength());
        System.out.println(cb.getWidth());

        cb.Area();
        cb.Volume1();


        System.out.println("Area of CB is = " +  cb.Area());
        System.out.println("Volume of CB is = " + cb.Volume1());





    }

}
