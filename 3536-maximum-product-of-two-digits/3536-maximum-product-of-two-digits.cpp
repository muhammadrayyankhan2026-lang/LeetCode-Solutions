class Solution {
public:
    int maxProduct(int n) {
        vector<int> num;
        while(n>0)
        {
            num.push_back(n%10);
            n/=10;
        }
        sort(num.begin(),num.end());
        int nk=num.size();
        return num[nk-1]*num[nk-2];
    }
};