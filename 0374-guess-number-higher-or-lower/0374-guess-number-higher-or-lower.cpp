/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

class Solution {
public:
    
    int guessNumber(int n) {
        long l=1,p=n,f=0;
        while(l<=p)
        {
            long m=l+(p-l)/2;
            f=guess(m);
            if (f==1) l=m+1;
            else if(f==-1) p=m-1;
            else return m;
        }
        return l;
    }
};