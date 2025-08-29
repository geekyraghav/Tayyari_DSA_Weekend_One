package Strings;

import java.util.Arrays;

public class MostFrequentCharacter {
    public char getMaxOccuringChar(String s) { // TC = O(n)
        int[] freq = new int[26];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            freq[ch-97]++;
        }
        int maxFreq = 0;
        char ans = s.charAt(0);
        for(int i=0;i<freq.length;i++){
            if(freq[i] > maxFreq){
                maxFreq = freq[i];
                ans = (char)(i+97);
            }
        }
        return ans;
    }

//    public char getMaxOccuringChar(String s) { // TC = O(nlogn)
//        int maxlen = 0;
//        char ans = s.charAt(0);
//        char[] arr = s.toCharArray();
//        Arrays.sort(arr);
//
//        int i = 0, j = 0;
//        while(j<arr.length){
//            if(arr[i]==arr[j]) j++;
//            else{ // i to j-1
//                int len = j-i;
//                if(len>maxlen){
//                    maxlen = len;
//                    ans = arr[i];
//                }
//                i = j;
//            }
//        }
//        int len = j-i;
//        if(len>maxlen){
//            maxlen = len;
//            ans = arr[i];
//        }
//        return ans;
//    }

//    public char getMaxOccuringChar(String s) { // TC = O(n^2)
//        int maxCount = 0;
//        char ans = s.charAt(0);
//        for(int i=0;i<s.length();i++){
//            int count = 1;
//            for(int j=i+1;j<s.length();j++){
//                if(s.charAt(i)==s.charAt(j)) count++;
//            }
//            if(count>maxCount){
//                maxCount = count;
//                ans = s.charAt(i);
//            }
//            else if(count==maxCount){
//                maxCount = count;
//                if(s.charAt(i)<ans) ans = s.charAt(i);
//            }
//        }
//        return ans;
//    }
}
