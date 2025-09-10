package Array.ArrayMedium;

public class StockBuyAndSell {
    public int output(int[] arr){
        int minBuy = arr[0];
        int profit = Integer.MIN_VALUE;
        for(int i = 1; i < arr.length; i++){
            profit = Math.max(arr[i] - minBuy, profit);
            minBuy = Math.min(arr[i], minBuy);
        }
        return Math.max(profit,0);
    }
}
