class Solution {
public:
    bool isHappy(int n) {
        int h=n;
        while(h!=1&&h!=4)
        {
            int s=0;
            while(h>0)
            {
                int g=h%10;
                s+=g*g;
                h/=10;
            }
            h=s;
        }
        return h==1;
    }
};