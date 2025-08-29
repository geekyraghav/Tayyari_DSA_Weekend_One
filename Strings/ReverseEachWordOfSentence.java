package Strings;

public class ReverseEachWordOfSentence {

    public static void main(String[] args) {
        String s = "Arjun is a dedicated guy";
//        change(s);
//        System.out.println(s);
        StringBuilder sb = new StringBuilder(s);
        reverseEachWord(sb);
        System.out.println(sb);
    }
    public static void reverseEachWord(StringBuilder sb) {
        int i = 0, j = 0;
        while(j<sb.length()){
            if(sb.charAt(j)!=' ') j++;
            else{ // i se lekar j-1 tak ka part reverse karne bhejo
                reversePart(sb,i,j-1);
                j++;
                i = j;
            }
        }
        reversePart(sb,i,j-1);
    }
    public static void reversePart(StringBuilder sb, int i, int j) {
        while(i<j){
            char ti = sb.charAt(i);
            char tj = sb.charAt(j);
            sb.setCharAt(i,tj);
            sb.setCharAt(j,ti);
            i++;
            j--;
        }
    }

//    private static void change(String s) {
//        s = "Raghav";
//    }


}
