package com.java.Problem_Solving;

public class Test1 {

    public static void main(String[] args) {
        int n =4;

        for(int i=0; i<n; i++){
            if(i<=1){
                for(int j=0; j<=i; j++){
                    System.out.print(j+i+1);


                }

            }else if(i>1 & i<3){
                for(int j=0; j<=i; j++){
                    System.out.print(j+i+2);


                }
            } else if (i<=3) {
                for(int j=0; j<=i; j++){
                    System.out.print(j+i+4);


                }

            }

            System.out.println();







        }



    }




}

