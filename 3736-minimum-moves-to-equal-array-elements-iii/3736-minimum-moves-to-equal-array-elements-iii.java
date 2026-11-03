class Solution {
    public int minMoves(int[] nums) {
        int m=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>m)
                m=nums[i];
        }
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            c+=Math.abs(nums[i]-m);
        }
        return c;
    }
}