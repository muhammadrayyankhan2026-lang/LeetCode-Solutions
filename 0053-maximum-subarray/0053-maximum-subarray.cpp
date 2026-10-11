class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int s=nums.size();
        int cS=0;
        int maxs=INT_MIN;
        for(int i=0;i<s;i++)
        {
            cS+=nums[i];
            maxs=max(cS,maxs);
            if(cS<0)
            {
                cS=0;
            }
        }
        return maxs;
    }
};