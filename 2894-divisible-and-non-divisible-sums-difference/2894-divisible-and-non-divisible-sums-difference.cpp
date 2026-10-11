class Solution {
public:
    int differenceOfSums(int n, int m) {
        int sn=0,sd=0;
        for(int i=1;i<=n;i++)
        {
            if(i%m!=0)
                sn+=i;
            else
                sd+=i;
        }
        return (sn-sd);
    }
};