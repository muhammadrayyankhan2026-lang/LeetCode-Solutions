class Solution {
    public int commonFactors(int a, int b) {
        int m1=Math.max(a,b);
        int y=Math.min(a,b);
        while(y!=0)
        {
            int rem=m1%y;
            m1=y;
            y=rem;
        }
        int c=0;
        for(int i=1;i<m1;i++)
        {
            if(a%i==0 && b%i==0)
                c++;
        }
        return c+1;
    }

}