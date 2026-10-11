class Solution {

    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set=new HashSet();
        for(int n : nums)
        {
            set.add(n);
        }
        int r=k;
        while(set.contains(r))
            r+=k;
        return r;
    }
};