import java.util.*;
class Solution {
    public String toGoatLatin(String sentence) {
        StringTokenizer st=new StringTokenizer(sentence);
        int a = st.countTokens();
        String h="";
        for(int i=0;i<a;i++)
        {
            String y=st.nextToken();
            if(Character.toLowerCase(y.charAt(0))=='a'||Character.toLowerCase(y.charAt(0))=='i'||Character.toLowerCase(y.charAt(0))=='o'||Character.toLowerCase(y.charAt(0))=='e'||Character.toLowerCase(y.charAt(0))=='u')
            {
                String w=y+"ma";
                String j=w+"a".repeat(i+1);
                h=h+j+" ";
            }
            else
            {
                String w=y.substring(1)+y.charAt(0)+"ma";
                String l=w+"a".repeat(i+1);
                h=h+l+" ";
            }
        }
        return h.strip();
    }
}