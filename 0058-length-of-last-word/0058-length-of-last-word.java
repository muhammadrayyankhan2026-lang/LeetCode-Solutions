import java.util.*;
class Solution {
    public int lengthOfLastWord(String s) {
        StringTokenizer st = new StringTokenizer(s);
        int a = st.countTokens();
        String[] h=new String[a];
        for(int i=0;i<a;i++)
        {
            h[i]=st.nextToken();
        }
        String k=h[a-1];
        int l = k.length();
        return l;
    }
}