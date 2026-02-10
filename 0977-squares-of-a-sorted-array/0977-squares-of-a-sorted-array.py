class Solution:
    def sortedSquares(self, nums: List[int]) -> List[int]:
        a_list = []

        for elem in nums:
            a_list.append(pow(elem,2))

        return sorted(a_list)