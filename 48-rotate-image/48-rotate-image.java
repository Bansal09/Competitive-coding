class Solution {
    public void rotate(int[][] matrix) {
        for(int i=0 ; i<matrix.length ; i++){
            for(int j=0 ; j<i ; j++){
                int temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        
        int n = matrix.length ;
        for(int i=0 ; i<matrix.length ; i++)
            reverse(i , n-1 , matrix);
        
    }
    
    
    public static void reverse(int i , int j , int [][]matrix){
        for(int k=0 ; k<matrix.length/2 ; k++){
            int temp = matrix[i][k];
            matrix[i][k]=matrix[i][j];
            matrix[i][j] = temp;
            j--;     
        }
    }
    
}