package Recursion;
import java.util.*;
public class PowerSet {
    private void subsets(StringBuilder s, String ans, int i, List<String> arr) {
        if(i==s.length()){
            if(ans.length()!=0) arr.add(ans);
            return;
        }
        char ch = s.charAt(i);
        subsets(s,ans,i+1,arr); // skip
        subsets(s,ans+ch,i+1,arr); // pick
    }
    public List<String> AllPossibleStrings(String s) {
        List<String> arr = new ArrayList<>();
        subsets(new StringBuilder(s),"",0,arr);
        Collections.sort(arr);
        return arr;
    }
}
