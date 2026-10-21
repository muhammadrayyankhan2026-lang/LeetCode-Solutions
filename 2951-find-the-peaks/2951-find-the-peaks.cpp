class Solution {
public:
    vector<int> findPeaks(vector<int>& mountain) {
        vector<int> res;
        int s=mountain.size();
        for(int i=1;i<s-1;i++)
        {
            if(mountain[i]>mountain[i-1] and mountain[i]>mountain[i+1])
                res.push_back(i);
        }
        return res;
    }

};