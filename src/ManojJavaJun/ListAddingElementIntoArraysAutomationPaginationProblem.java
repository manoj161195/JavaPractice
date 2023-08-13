package ManojJavaJun;

import java.util.ArrayList;
import java.util.List;

public class ListAddingElementIntoArraysAutomationPaginationProblem {

//    public void





    public static void main(String[] args) {

        List<String> a = new ArrayList<>();

//        a.add("man1");
//        a.add("man2");
//        a.add("man3");
//        a.add("man4");
//        a.add("man5");

        List<String> mylist = new ArrayList<>();

        for(String element: a){

            mylist.add(element);

        }

        boolean check = mylist.isEmpty() == true;

        if(!check == true) {

            for (String mylistname : mylist) {
                System.out.print(" " + mylistname);
            }
            System.out.println();


            a.add("man11");
            a.add("man22");
            a.add("man33");
            a.add("man44");
            for (String element : a) {

                mylist.add(element);

            }


            for (String mylistname : mylist) {
                System.out.print(" " + mylistname);
            }
            System.out.println();
            System.out.println("It is not Empty");
        }else {
            System.out.println("It is Empty");
        }

    }
}
