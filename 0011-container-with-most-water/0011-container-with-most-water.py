class Solution:
    def maxArea(self, nums: List[int]) -> int:
        l = 0
        r = len(nums) - 1
        maxLen = 0

        while l < r:
            if nums[l] < nums[r]:
                maxLen = max(maxLen, (r - l) * nums[l])
                l += 1
            else:
                maxLen = max(maxLen, (r - l) * nums[r])
                r -= 1

        return maxLen