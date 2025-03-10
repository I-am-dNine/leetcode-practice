class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxPrice = 0;

        for (int price : prices) {
            // 找最小，用于找出最大获利
            if (price < minPrice) {
                minPrice = price;
            } else {
                maxPrice = Math.max(maxPrice, price - minPrice);
            }
        }

        return maxPrice;
    }
}