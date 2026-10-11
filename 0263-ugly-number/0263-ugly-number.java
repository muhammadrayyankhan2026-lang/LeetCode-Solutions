class Solution {
    public boolean isUgly(int n) {
        if (n==0) return false;
        if(n==1)
            return true;
        int p[]={2,3,5};
        for (int h : p)
        {
            while(n%h==0)
                n/=h;
        }
        return n==1;
    }
}