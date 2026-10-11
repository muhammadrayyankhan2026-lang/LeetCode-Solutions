class Solution {
public:
    int countPartitions(vector<int>& nums) {
        int t=0;
        for(int num:nums)
            t+=num;
        int l=0;
        int c=0;
        for(int i=0;i<nums.size()-1;i++)
        {
            l+=nums[i];
            int r=t-l;
            if((r-l)%2==0)
                c++;
        }
        return c;
    }
};