class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int y=nums[0];
        int p=nums[0];
        if(nums.length==1)
        {
            y=nums[0];
            p=nums[0];
        }
        else{
        for (int n:nums)
        {
            p=Math.max(p,n);
            y=Math.min(y,n);
        }
        }
        
        if((y+k)>=(p-k))
            return 0;
        System.out.println(y+" "+p);
        return (p-k)-(y+k);
    }
}