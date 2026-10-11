class Solution {
    public int myAtoi(String s) {
        s=s.strip();
        int n=s.length();
        if(n==0)
            return 0;
        int sign=1;
        int i=0;
        if(s.charAt(i)=='-')
        {
            sign=-1;
            i++;
        }
        else if(s.charAt(i)=='+')
         i++;
        long num=0;
        while(i<n)
        {
            char ch=s.charAt(i);
            if(ch<'0'||ch>'9')
                break;
            num=num*10+(ch-'0');
            if(sign==1 && num>2147483647)
                return 2147483647;
            if(sign==-1 && num>2147483647)
                return -2147483648;
            i++;
        }
        return (int)num*sign;
    }
}