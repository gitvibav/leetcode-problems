class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        set_elem = set(nums)
        cons = 0

        for num in set_elem:
            if num - 1 not in set_elem:
                curr = num
                count = 0
                while curr in set_elem:
                    count += 1
                    curr += 1
                cons = max(cons, count)
        
        return cons

