package ManojJavaJun;

public class NormalarrayReverse {
    public static void main(String[] args) {

        int [] man = {1,2,3,4,5};



        for(int i=0; i<man.length; i++){
            System.out.print(" " + man[i]);

        }




        System.out.println(" Reversed Array values");

        System.out.println(man.length);

        for(int i=man.length-1; i>=0; i--){

            System.out.print(" " + man[i] );

        }
    }
}
