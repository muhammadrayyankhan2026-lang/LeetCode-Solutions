class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r=matrix.length;
        int l=matrix[0].length;
        int p=0; int o=r*l-1;
        while(p<=o)
        {
            int mid=p+(o-p)/2;
            int row=mid/l;
            int c=mid%l;
            if(matrix[row][c]==target)
                return true;
            if (matrix[row][c]<target)
                p=mid+1;
            else
                o=mid-1;
            
        }
        return false;
    }
}