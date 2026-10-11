class Solution {
public:
    vector<int> countOppositeParity(vector<int>& nums) {
        vector<int> k(nums.size());
        fill(k.begin(),k.end(),0);
        for(int i=0;i<nums.size();i++)
        {
            if(nums[i]%2==0)
            {
                for(int j=i+1;j<nums.size();j++)
                {
                    if(nums[j]%2!=0)
                        k[i]++;
                }
            }
            else
            {
                for(int j=i+1;j<nums.size();j++)
                {
                    if(nums[j]%2==0)
                        k[i]++;
                }
            }
        }
        return k;
    }
};