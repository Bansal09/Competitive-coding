class Solution {
    public void sortColors(int[] nums) {
        int c0=0 , c1=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
                c0++;
            else if(nums[i]==1)
                c1++;
        }
        
        int k=0;
        for(int i=0; i<c0 ;i++){
            nums[k]=0;
            k++;
        }
        
        
         for(int i=0; i<c1 ;i++){
            nums[k]=1;
            k++;
        }
        
        for(int i=k;i<nums.length;i++)
            nums[i]=2;
        
    }
}