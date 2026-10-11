class Solution {
    public boolean isPerfectSquare(int num) {
        if (num==2147483647)
            return false;
        long s=0;
        long e=num;
        long m=-1;
        while(s<=e)
        {
            m=s+(e-s)/2;
            if(m*m==num)
                return true;
            if(m*m>num)
                e=m-1;
            else   
                s=m+1;
        }
        return e*e==num;
    }
}