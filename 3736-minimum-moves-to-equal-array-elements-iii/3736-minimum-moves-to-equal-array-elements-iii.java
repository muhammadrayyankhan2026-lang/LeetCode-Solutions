class Solution {
    public int minMoves(int[] nums) {
        int m=nums[0];
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            c+=nums[i];
            if(nums[i]>m)
                m=nums[i];
        }
        return (nums.length*m)-c;
    }
}