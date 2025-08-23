class Solution {
    String modify(String s) {
        char ch = s.charAt(0);
        if(ch>=97 && ch<=122) return s.toLowerCase();
        else return s.toUpperCase();
    }
}
