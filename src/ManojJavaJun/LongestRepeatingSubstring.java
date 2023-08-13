package ManojJavaJun;

public class LongestRepeatingSubstring {

    public static String returSubstring(String s, String t){

        int n = Math.min(s.length(),t.length());
        for(int i = 0; i < n; i++){
            if(s.charAt(i) != t.charAt(i)){
                return s.substring(0,i);
            }
        }
        return s.substring(0,n);
    }



    public static void main(String[] args) {
        String str = "abcdabcxyz";
        String prac = "";



        for (int i=0; i<str.length(); i++){


            for(int j=i+1; j<str.length(); j++){


                String x = returSubstring(str.substring(i,str.length()), str.substring(j, str.length()));



                if(x.length() > prac.length()) prac=x;

            }


        }
        System.out.println("Longest repeating sequence: " + prac);
    }
}
