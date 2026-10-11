class Solution {
public:
    vector<int> selfDividingNumbers(int left, int right) {
        vector<int> j;
        for(int i=left;i<=right;i++)
        {
            int r=i;
            int c=0;
            int m=0;
            while(r>0)
            {
                m++;
                int g=r%10;
                
                if(g!=0 && i%g==0)
                    c++;
                r/=10;
            }
            if(m==c)
                j.push_back(i);
        }
        return j;
    }
};