class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int h[]=new int[nums.length];
        int i=0,j=1;
        for(int num:nums)
        {
            if(num%2==0)
            {
                h[i]=num;
                i+=2;
            }
            else
            {
                h[j]=num;
                j+=2;
            }
        }
        return h;
    }
}