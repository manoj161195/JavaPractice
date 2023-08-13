package ManojJavaJun;

import java.util.Scanner;

public class ArrayTakingInputForArrays {

    public static void printArray(int twoD[][]) {

        for (int i = 0; i < twoD.length; i++) {

            for (int j = 0; j < twoD[0].length; j++) {

                System.out.print(twoD[i][j] + " ");

            }
            System.out.println();

        }


    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Give value for M");
        int m = sc.nextInt();
        System.out.println("Give value for N");

        int n = sc.nextInt();

        int[][] userArray = new int[m][n];

        System.out.println("Taking arrays value input");


        for (int i = 0; i < userArray.length; i++) {

            for (int j = 0; j < userArray[0].length; j++) {

                userArray[i][j] = sc.nextInt();

            }
            System.out.println();

        }


        printArray(userArray);


    }


}

