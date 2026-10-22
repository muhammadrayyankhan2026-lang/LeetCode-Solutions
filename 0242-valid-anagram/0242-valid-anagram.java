class Solution {
    public boolean isAnagram(String s, String t) {
        char ch[]=new char[26];
        s=s.toLowerCase();
        t=t.toLowerCase();
        for(int i=0;i<s.length();i++)
        {
            char f=s.charAt(i);
            ch[f-97]++;
        }
        for(int i=0;i<t.length();i++)
        {
            char y=t.charAt(i);
            ch[y-97]--;
        }
        for(int i=0;i<26;i++)
        {
            if(ch[i]!=0)
                return false;
        }
        return true;
    }
}