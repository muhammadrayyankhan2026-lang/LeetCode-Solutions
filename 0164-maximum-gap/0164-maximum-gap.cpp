class Solution {
public:
    int maximumGap(vector<int>& nums) {
        if(nums.size()<2)
            return 0;
        sort(nums.begin(),nums.end());
        int ma=0;
        int l=0;
        int m=1;
        while(l<nums.size()&&m<nums.size())
        {
            int d=nums[m]-nums[l];
            m++;
            l++;
            ma=max(ma,d);
        }
        return ma;
    }
};