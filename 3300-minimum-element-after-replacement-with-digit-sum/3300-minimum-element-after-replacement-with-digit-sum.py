class Solution:
    def minElement(self, nums: List[int]) -> int:

        ans = 999999999

        for num in nums:
            temp = str(num)
            sum1 = 0
            for t in temp:
                sum1 += int(t)

            ans = min(ans, sum1)

        return ans


        