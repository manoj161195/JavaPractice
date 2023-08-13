package ManojJavaJun;

public class ArrayReverse {

    public static void forwardArray(int [] array){

        for(int i=0; i<array.length; i++){
            System.out.print(" " + array[i]);

        }
        System.out.println("Forward Array completed");
    }


    public static void main(ArrayReverse[] args) {

        int [] man = {1,2,3,4,5};

        forwardArray(man);
        System.out.println("Done");


    }
}
