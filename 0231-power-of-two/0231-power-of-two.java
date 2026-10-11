class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1)
            return true;
        int h=n;
        int c=0;
        while(h>0)
        {
            int g=h%2;
            if(g==1)
                c++;
            h=h/2;
        }
        if(c==1)
            return true;
        return false;
    }
}