class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        map = {}

        for i, num in enumerate(nums):
            if target - num in map.keys():
                return [map[target-num], i]
            else:
                map[num] = i

        return [0,0]