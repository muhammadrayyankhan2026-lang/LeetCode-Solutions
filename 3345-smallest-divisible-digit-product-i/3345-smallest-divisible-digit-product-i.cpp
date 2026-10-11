class Solution {
public:
    int dprod(int k)
    {
        int h=1;
        while(k>0)
        {
            int g=k%10;
            h*=g;
            k/=10;
        }
        return h;
    }
    int smallestNumber(int n, int t) {
        for(int i=n;i<=100;i++)
        {
            if(dprod(i)%t==0)
                return i;
        }
        return -1;
    }
    
};