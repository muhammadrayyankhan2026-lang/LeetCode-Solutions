import java.util.*;
class Solution {
    public int mySqrt(int x) {
        int s=0;
        int e=x;
        int m=-1;
        while(s<=e)
        {
            m=s+(e-s)/2;
            if(m*m==x)
                return m;
            else if((long)m*m>(long)x)
                e=m-1;
            else
                s=m+1;
        }
        return e;
    }
}