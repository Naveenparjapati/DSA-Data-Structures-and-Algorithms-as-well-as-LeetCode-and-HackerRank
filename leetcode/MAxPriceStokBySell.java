package leetcode;

//lcode   121
class MAxPriceStokBySell {
    public int maxProfit(int[] prices) {
        // Initialize variables for the minimum price seen so far and the maximum profit
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        // Loop through the prices array
        for (int price : prices) {
            // Update the minimum price if the current price is lower
            if (price < minPrice) {
                minPrice = price;
            }
            // Calculate the profit if sold today and update maxProfit if it's higher than the current maxProfit
            else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        MAxPriceStokBySell solution = new MAxPriceStokBySell();

        // Example stock prices
        int[] prices = {7, 1, 5, 3, 6, 4};

        // Calculate the maximum profit
        int maxProfit = solution.maxProfit(prices);

        // Print the result
        System.out.println("Maximum Profit: " + maxProfit);
    }
}
