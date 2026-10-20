class Solution:
    def twoSum(self, nums: list[int], target: int) -> list[int]:
        hm = {}
        
        for i in range(0, len(nums)):

            if target - nums[i] in hm:
                return [hm[target - nums[i]], i]

            hm[nums[i]] = i

        return [0,0]
