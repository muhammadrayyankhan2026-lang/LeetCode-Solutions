class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0)
            return false;
        int u=0;
        int n1=n;
        while(n1>0)
        {
            u++;
            n1/=3;
        }
        int an=1;
        for(int i=1;i<u;i++)
            an*=3;
        return n==an;
    }
}