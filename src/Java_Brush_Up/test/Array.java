package Java_Brush_Up.test;

public class Array {
//    Method 1
    public static void main(String[] args) {
      /*  int [] marks;
        marks = new int [5];

       marks [0] = 1;
       marks [1] = 2;
       marks [2] = 3;
       marks [3] = 4;
       marks [4] = 5;

//        System.out.println(marks.length);
        for(int i=0; i<5; i++ ){
            System.out.println(marks[i]);

        }*/


//        Method 2
        /* int [] marks = {11, 12, 13, 14, 15, 16};
//        System.out.println(marks.length);
        for (int i=0; i<6; i++ ){
            System.out.println(marks[i]+  "\"Good doing good\"");
        }*/

//        Method 3
        int [] marks = {11, 12, 13, 14, 15, 16};
        for(int element: marks){
            System.out.println(element);
        }




    }
}
