class Solution {
    public int maxProfit(int[] prices) {
        // int sum=0 , max=0;
        // for(int i=0 ; i<prices.length-1 ; i++){
        //     int temp=prices[i];
        //     for(int j=i+1 ; j<prices.length ; j++){
        //         sum =  prices[j] - temp;
        //         if(sum<0)
        //             sum=0;
        //         max=Math.max(sum,max);
        //     }
        // }
        // return max;
        
        int profit =0;
        int min = Integer.MAX_VALUE;
        for(int i=0 ; i<prices.length ; i++){
            min = Math.min(prices[i] , min);
            profit = Math.max(profit , prices[i]-min);
        }
        return profit;
    }
    
}