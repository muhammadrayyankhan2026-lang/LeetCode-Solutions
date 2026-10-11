class Solution {
public:
    int minimumDeletions(vector<int>& nums) {
        int n=nums.size();
        int a=0,b=0;

        for(int i=0;i<n;i++)
        {
            if(nums[i]>nums[a]) a=i;
            if(nums[i]<nums[b]) b=i;
        }
        if(a>b) swap(a,b);
        int x=a+1+(n-b);
        int y=n-a;
        int z=b+1;

        return min({x,y,z});
    }
};