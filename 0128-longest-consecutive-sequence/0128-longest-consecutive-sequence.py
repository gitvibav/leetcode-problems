class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        nums_set = set(nums)

        length = 0

        for num in nums_set:
            temp = num
            if temp-1 not in nums_set:
                temp_length = 0
                while temp in nums_set:
                    temp_length += 1
                    temp += 1
                length = max(length, temp_length)

        return length

