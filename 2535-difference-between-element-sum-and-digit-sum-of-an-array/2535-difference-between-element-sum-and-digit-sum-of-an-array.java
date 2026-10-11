class Solution {
    public int differenceOfSum(int[] nums) {
        int k=nums.length;
        int ps=0,d=0;
        for(int i=0;i<k;i++)
        {
            ps+=nums[i];
            int n=nums[i];
            while(n>0)
            {
                int g=n%10;
                d+=g;
                n/=10;
            }
        }
        return Math.abs(ps-d);
    }
}