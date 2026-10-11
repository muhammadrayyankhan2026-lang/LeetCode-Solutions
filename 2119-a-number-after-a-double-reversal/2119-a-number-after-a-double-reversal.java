class Solution {
    public int reverse(int n)
    {
        int rev=0;
        while(n>0)
        {
            int g=n%10;
            rev=rev*10+g;
            n/=10;
        }
        return rev;
    }
    public boolean isSameAfterReversals(int num) {
        if(num==0)  return true;
        if(num%10==0)   return false;
        int h=reverse(num);
        int j=reverse(h);
        return num==j;
    }
}