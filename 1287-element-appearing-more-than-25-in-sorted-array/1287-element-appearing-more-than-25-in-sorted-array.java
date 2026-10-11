class Solution {
    public int findSpecialInteger(int[] arr) {
        int l=arr.length;
        int q=l/4;
        int p=arr[0];
        int c=0;
        for(int i=0;i<l;i++)
        {
            if(p==arr[i])c++;
            else c=1;
            if(c>q) return arr[i];
            p=arr[i];
        }
        return 0;
    }
}