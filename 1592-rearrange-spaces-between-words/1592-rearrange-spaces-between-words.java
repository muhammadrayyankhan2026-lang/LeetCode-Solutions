import java.util.*;
class Solution {
    public String reorderSpaces(String text) {
        
        StringTokenizer st=new StringTokenizer(text);
        int a =st.countTokens();
        int scount=0;
       
        for(int i=0;i<text.length();i++)
        {
            char ch=text.charAt(i);
            if(ch==' ')
                scount++;
        }
        if(a==1)
            return text.strip()+" ".repeat(scount);
        if(a==1&&scount==0)
            return text;
        int y=scount/(a-1);
        int h=scount%(a-1);
        String j="";
        for(int i=0;i<a;i++)
        {
            String h1=st.nextToken();
            h1=h1+" ".repeat(y);
            j=j+h1;
        }
        j=j.strip();
        if(h!=0)
            j=j+" ".repeat(h);
        return j;
    }
}