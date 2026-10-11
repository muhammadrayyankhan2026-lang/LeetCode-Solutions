class Solution {
public:
    long long countCommas(long long n) {
        long c=1000;
        long r=0;

        while(c<=n)
        {
            r+=n-c+1;
            c*=1000;
        }
        return r;
    }
};