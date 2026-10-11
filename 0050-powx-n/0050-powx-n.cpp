class Solution {
public:
    double myPow(double x, int n) {
    if(n==0) return 1.0;
    if(x==0) return 0.0; 
    if(x==1) return 1.0;  
    if(x==-1&&n&2==0) return 1.0;
    if(x==-1&&n%2!=0) return -1.0;
    long b=n;
    double ans=1;
    if(n<0)
    {
        x=1/x;
        b=b*-1;
    }


        while(b>0)
        {
            if(b%2==1)
            {
                ans*=x;
            }
            x=x*x;
            b=b/2;
        }
        
        return ans;
    }
};