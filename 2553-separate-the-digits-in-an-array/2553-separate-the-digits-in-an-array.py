class Solution:
    def separateDigits(self, nums: List[int]) -> List[int]:
        res = []

        for num in nums:
            temp = list(str(num))
            for t in temp:
                res.append(int(t))
        
        return res