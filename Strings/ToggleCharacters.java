package Strings;

public class ToggleCharacters {
    public String toggleCase(String s) {
        StringBuilder sb = new StringBuilder(s);
        for(int i=0;i<sb.length();i++){
            char ch = sb.charAt(i);
            if(ch>=65 && ch<=90){ // capital nikla
                char small = (char)(ch+32);
                sb.setCharAt(i,small);
            }
            else if(ch>=97 && ch<=122){ // small nikla
                char capital = (char)(ch-32);
                sb.setCharAt(i,capital);
            }
        }
        return sb.toString();
    }
}
