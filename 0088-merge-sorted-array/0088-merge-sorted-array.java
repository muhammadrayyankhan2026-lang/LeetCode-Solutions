class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int w1=m-1;
        int w2=n-1;
        int w=m+n-1;
        while(w2>=0)
        {
            if(w1>=0&&nums1[w1]>nums2[w2])
            {
                nums1[w]=nums1[w1];
                w1--;
                w--;
            }
            else
            {
                nums1[w]=nums2[w2];
                w2--;
                w--;
            }
        }
    }
}