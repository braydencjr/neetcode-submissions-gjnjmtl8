class Solution {
    public int maxProfit(int[] prices) {
        int front = 0;
        int back = 1;
        int profit = 0;
        int max = 0;
        while(back < prices.length){
            if(prices[front] < prices[back]){
                profit = prices[back]- prices[front];
                if(profit > max){
                    max = profit;
                }
            } 
            else{
                front = back;
            }
            back++;
        }
        return max;
    }
}
