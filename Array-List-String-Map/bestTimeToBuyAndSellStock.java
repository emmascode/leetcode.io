class BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices) {
        int min = prices[0];
        int profit = 0;
        for(int i=1; i < prices.length; i++) {
            //if i sell
            int diff = prices[i] - min;
            if(diff > profit){
                profit = diff;
            }
            if(prices[i] < min){
                min = prices[i];
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int[] prices = new int[] {7,1,5,3,6,4};
        System.out.println(BestTimeToBuyAndSellStock.maxProfit(prices));
    }
}

// class Solution {
//     public int maxProfit(int[] prices) {
//         int profit = 0;
//         for (int i = 0; i < prices.length -1; i++) {
//             for (int j = i + 1; j < prices.length; j++) {
//                 if (prices[j] - prices[i] >= profit) {
//                     profit = prices[j] - prices[i];
//                 }
//             }
//         }
//         return profit;       
//     }
// }