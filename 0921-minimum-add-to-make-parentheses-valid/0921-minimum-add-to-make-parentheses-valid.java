class Solution {
    public int minAddToMakeValid(String s) {
        int l=0;
        int h=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='(')
            {
                l++;
                
            }
            else 
            {
                if(l>0)
                    l--;
                else
                h++;
            }
        }
        
        return l+h;
    }
}