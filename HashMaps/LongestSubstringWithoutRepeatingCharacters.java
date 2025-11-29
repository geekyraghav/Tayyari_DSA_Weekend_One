package Heaps_And_Hashmaps;
import java.util.HashSet;
public class LongestSubstringWithoutRepeatingCharacters {
    public int longestUniqueSubstr(String s) {
        HashSet<Character> set = new HashSet<>();
        int i = 0, j = 0, maxlen = 0;
        while(j<s.length()){
            char ch = s.charAt(j);
            if(!set.contains(ch)){
                set.add(ch);
                j++;
            }
            else{
                int len = j-i;
                maxlen = Math.max(maxlen,len);
                while(s.charAt(i)!=ch){
                    set.remove(s.charAt(i));
                    i++;
                }
                i++;
            }
        }
        int len = j-i;
        maxlen = Math.max(maxlen,len);
        return maxlen;
    }
}
