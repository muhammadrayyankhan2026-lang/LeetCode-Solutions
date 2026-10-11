class Solution {
    public int subtractProductAndSum(int n) {
        int s=0,p=1;
        while(n>0)
        {
            int g=n%10;
            s+=g;
            p*=g;
            n/=10;
        }
        return p-s;
    }
}