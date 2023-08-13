package ManojJavaJun;

public class Max_Min_value_Array {
    public static void main(String[] args) {
        int [] ab = new int[6];
        ab[0] = 1;
        ab[1] = 2;
        ab[2] = 80;
        ab[3] = 0;
        ab[4] = 1;
        ab[5] = 9;

        int max =0;


//        Loop for Max value

        for(int i=0; i<ab.length; i++){


            if(ab[i]>max){

                max = ab[i];

            }


        }
        System.out.println("Max value of Array is = "+ max);


//        Loop for Min value
        int min =ab[0];
        for(int i=0; i<ab.length; i++){


            if(ab[i]<min){

                min = ab[i];

            }


        }
        System.out.println("Min value of Array is = "+ min);




    }
}
