class Solution:
    def minElement(self, nums: List[int]) -> int:

        ans = []

        for num in nums:
            temp = str(num)
            sum1 = 0
            for t in temp:
                sum1 += int(t)

            ans.append(sum1)

        return min(ans)


        