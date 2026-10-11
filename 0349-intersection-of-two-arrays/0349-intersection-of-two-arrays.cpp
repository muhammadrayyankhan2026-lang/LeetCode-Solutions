class Solution {
public:
    vector<int> intersection(vector<int>& nums1, vector<int>& nums2) {
        int l=nums1.size();
        int k=nums2.size();
        vector <int> n;
        for(int i=0;i<nums1.size();i++)
        {
            int h=nums1[i];
            for(int j=0;j<nums2.size();j++)
            {
                if(h==nums2[j])
                {
                    n.push_back(h);
                }
            }
        }
        vector <int> n2;
    for(int i=0;i<n.size();i++)
    {
        bool f = false;
        for(int j=0;j<n2.size();j++)
        {
            if(n[i]==n2[j])
            {
                f=true;
                break;
            }
        }
        if(!f)
        {
            n2.push_back(n[i]);
        }
    }
    return n2;
    }
};