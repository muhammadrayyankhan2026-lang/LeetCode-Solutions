class Solution {
    public boolean isPowerOfFour(int n) {
        if (n==1)
        return true;
        if(n==0)
        return false;
        int c=0;
        int h=n;
        while(h>0)
        {
            c++;
            h/=4;
        }
        int g=1;
        for(int i=1;i<c;i++)
            g*=4;
        return g==n;
    }
}