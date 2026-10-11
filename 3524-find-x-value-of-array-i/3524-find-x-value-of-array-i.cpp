class Solution {
public:
    vector<long long> resultArray(vector<int>& nums, int k) {
        vector<long long>ans(k,0);
        vector<long long>dp(k,0);
        for (int x:nums)
        {
            vector<long long> newdp(k,0);
            newdp[x%k]++;
            for(int i=0;i<k;i++)
            {
                if(dp[i]>0)
                {
                    int newR=(i*(x%k))%k;
                    newdp[newR]+=dp[i];
                }
            }
            dp=newdp;
            for(int i=0;i<k;i++)
                ans[i]+=dp[i];
        }
        return ans;
    }
};