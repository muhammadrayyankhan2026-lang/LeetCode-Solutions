import java.util.*;
class Solution {
    public String capitalizeTitle(String title) {
       title=title.toLowerCase();
       StringTokenizer st = new StringTokenizer(title);
       int a = st.countTokens();
       String h="";
       for (int i=0;i<a;i++)
       {
        String l=st.nextToken();
        if(l.length()<3)
        {
            h+=l+" ";
        }
        else {
        char ch=l.charAt(0);
        ch=Character.toUpperCase(ch);
        String k=ch+l.substring(1);
        h=h+k+" "; }
       } 
       return h.strip();
    }
}