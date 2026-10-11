class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        int s=nums.size();
        vector<int> v;
        int c=0;
        for(int i =0;i<s;i++)
        {
            for(int j=i+1;j<s;j++)
            {
                int n=nums[i]+nums[j];
                if(n==target)
                {
                    v.push_back(i);
                    v.push_back(j);
                    c=1;
                    break;
                }
            }
            if(c==1)
            {
                break;
            }
        }
        return v;
    }
};