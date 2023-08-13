package ManojJavaJun;

public class StringReverse {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Manoj");

        for(int i=0; i<sb.length()/2; i++) {
            int front = i;
            int back = sb.length() - 1 - i;



            char first = sb.charAt(front);
            char last = sb.charAt(back);

            sb.setCharAt(front, last);
            sb.setCharAt(back, first);


        }
        System.out.println(sb);


    }
}
