class Solution:
    def maxArea(self, height: List[int]) -> int:
        ans = 0
        start = 0
        end = len(height) - 1

        while start < end:
            if height[start] < height[end]:
                ans = max(ans, (end-start) * height[start])
                start += 1
            else:
                ans = max(ans, (end-start) * height[end])
                end -= 1

        return ans
