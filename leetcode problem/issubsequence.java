import java.util.*;
class Solution {
    public boolean isSubsequence(String s, String t) {
        char [] ch1=s.toCharArray();
        char [] ch2=t.toCharArray();
        int i=0;
        int j=0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
                
            }
            j++;

        }
        return i==s.length();
    }
}
