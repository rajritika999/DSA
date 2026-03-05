package Arrays;
// Write a class Solution with a method maxProfit that takes an array of integers representing the price of a stock on each day, and returns the maximum profit that can be achieved by buying and selling the stock. You can only complete one transaction (i.e., buy one and sell one share of the stock), and you cannot sell a stock before you buy it. 

public class StockBuySell {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        StockBuySell solution = new StockBuySell();
        int[] prices = {7, 1, 5, 3, 9, 41};
        int result = solution.maxProfit(prices);
        System.out.println("Maximum Profit: " + result);
    }
}