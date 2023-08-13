package ManojJavaJun;

public class PrintValueAtEvenPosition {
    public static void main(String[] args) {

        int [] ab = {1,2,3,4,5,6,7,8,9,10};
        for(int i=0; i<=ab.length; i= i+2){
            System.out.print(" " +i);


        }
        System.out.println();

//        Loop for Odd Values
        for(int i=1; i<=ab.length; i= i+2){
            System.out.print( " "+i);


        }

    }
}
