class Solution {
    public int firstMissingPositive(int[] nums) {
        int l=nums.length;
        int h=l+1;
        int[] p= new int[h];
        for(int i:nums)
        {
            if(i>0&&i<=l)
                p[i]=1;

        }
        for(int i=1;i<=l;i++)
        {
            if(p[i]==0)
                return i;
        }
        return h;
    }
}