class Solution {
    int signFunc(int[] x)
    {
        int l=x.length;
        int c=0;
        for(int i=0;i<l;i++)
        {
            if(x[i]==0)
                return 0;
            else if(x[i]<0)
            c++;
        }
        if(c%2==0)
            return 1;
        else if(c%2!=0)
            return -1;
        return 0;
    }
    public int arraySign(int[] nums) {
        return signFunc(nums);
    }
}