class Solution {
    public int findDuplicate(int[] nums) {
//         int ans = 0;
//         for(int i=0 ; i<nums.length ; i++){
//             ans^=nums[i];
//         }
        
//         for(int i=0 ; i<nums.length-1 ; i++)
//             ans^=nums[i];
//         return ans;
        
        int []arr=new int[nums.length];
        for(int i=0 ; i<nums.length ; i++){
            if(arr[nums[i]]==1)
                return nums[i];
            arr[nums[i]]++;
        }
        return 0;
    }
}