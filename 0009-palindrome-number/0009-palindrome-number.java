class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        int r=0,n=x;
        while(n>0)
        {
            int g=n%10;
            r=r*10+g;
            n=n/10;
        }
        if(r==x)
            return true;
        return false;
    }
}