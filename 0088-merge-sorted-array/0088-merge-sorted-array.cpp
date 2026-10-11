class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        for(int i=nums1.size()-1;i>=0;i--)
        {
            if(nums1[i]==0)
                nums1.pop_back();
            else 
                break;
        }
         for(int i=nums2.size()-1;i>=0;i--)
        {
            if(nums2[i]==0)
                nums2.pop_back();
            else
                break;
        }
        for(int i =0;i<n;i++)
        {
            nums1.push_back(nums2[i]);
        }
        int y=m+n;
        for(int i=0;i<y;i++)
        {
            for(int j=0;j<y-i-1;j++)
            {
                if(nums1[j]>nums1[j+1])
                {
                    swap(nums1[j],nums1[j+1]);
                }
            }
        }
        if(y!=nums1.size())
        {
            int h=y-nums1.size();
            for(int i=0;i<h;i++)
            {
                nums1.push_back(0);
            }
        }
        
    }
};