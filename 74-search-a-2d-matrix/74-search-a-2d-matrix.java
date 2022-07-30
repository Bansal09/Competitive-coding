class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix[0].length;
        if(matrix.length==1 && n==1 && matrix[0][0]==target)
            return true;
        if(matrix.length==1 && n==1 && matrix[0][0]!=target)
            return false;
        
        int a1[]=new int[matrix.length];
        
        for(int i=0 ; i<matrix.length ; i++)
            a1[i]=matrix[i][n-1];
        int pos =0;
        for(int i=0 ; i<a1.length ; i++){
            if(a1[i]>=target)
            {
                pos=i;
                break;
            }
        }
        boolean ans =false;
        for(int i=0 ; i<n ; i++){
            if(matrix[pos][i]==target)
                ans=true;
        }
        return ans;
    }
}