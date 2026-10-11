import java.util.*;
class Solution {
    public String reverseWords(String s) {
        String j="";
        StringTokenizer st = new StringTokenizer(s);
        int a = st.countTokens();
        for(int i=0;i<a;i++)
        {
            String o=new StringBuilder(st.nextToken()).reverse().toString();
            j=j+o+" ";
        }
        return j.strip();
    }
}