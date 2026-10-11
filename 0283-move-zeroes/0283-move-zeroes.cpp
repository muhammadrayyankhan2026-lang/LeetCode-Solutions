class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        int n=nums.size();
        if(n==1&&nums[0]==0)
        {
            cout<<nums[0];
        }
        int i=0,j=0;
        while(j<n)
        {
            if(nums[j]!=0)
            {
                int tmp=nums[i];
                nums[i]=nums[j];
                nums[j]=tmp;
                i++;
            }
            j++;
        }
        
    }
};