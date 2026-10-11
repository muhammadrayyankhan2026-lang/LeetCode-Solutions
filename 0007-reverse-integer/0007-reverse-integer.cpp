class Solution {
public:
    int reverse(int x) {
        int l=x;
        long rev=0;
        while(l!=0)
            {
                int u=l%10;
                rev=rev*10+u;
                l/=10;
            }
        if(rev>2147483648 || rev<-2147483648)
            return 0;
        return (int)rev;
    }
};