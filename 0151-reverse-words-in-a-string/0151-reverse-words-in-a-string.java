import java.util.*;
class Solution {
    public String reverseWords(String s) {
        StringTokenizer st=new StringTokenizer(s);
        int a = st.countTokens();
        String g[]=new String[a];
        for(int i=a-1;i>=0;i--)
        {
            g[i]=st.nextToken();
        }
        String ss="";
        for(int i=0;i<a;i++)
        {
            ss+=g[i]+" ";
        }
        return ss.trim();
    }
}