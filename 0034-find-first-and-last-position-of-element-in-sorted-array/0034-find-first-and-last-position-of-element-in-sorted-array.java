class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;
        int res[]={-1,-1};
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            if(nums[mid]>=target)
                r=mid-1;
            else
                l=mid+1;

        }
        if(l==nums.length||nums[l]!=target)
            return res;
        res[0]=l;
        l=0;
        r=nums.length-1;
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            if(nums[mid]<=target)   l=mid+1;
            else    r=mid-1;
        }
        res[1]=r;
        return res;
    }
}