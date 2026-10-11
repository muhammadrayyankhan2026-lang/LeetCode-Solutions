class Solution {
public:
    bool checkDivisibility(int n) {
        int j=n;
        int s=0,p=1;
        while(j>0)
        {
            int h=j%10;
            s+=h;
            p*=h;
            j/=10;
        }
        if(n%(s+p)==0)  
            return true;
        return false;
    }
};