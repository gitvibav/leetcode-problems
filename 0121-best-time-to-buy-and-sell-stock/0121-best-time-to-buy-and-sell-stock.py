class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        ans = 0
        min_stock = 999999999

        for price in prices:
            if price < min_stock:
                min_stock = price

            ans = max(ans, price - min_stock)

        return ans
