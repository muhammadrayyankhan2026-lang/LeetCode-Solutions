class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int l=nums.length;
        int y=0;
        for(int i=0;i<l;i++)
        {
            if(nums[i]%2==0)
            {
                int t=nums[i];
                nums[i]=nums[y];
                nums[y]=t;
                y++;
            }
        }
        return nums;
    }
}