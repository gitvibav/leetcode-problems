class Solution:
    def sortByBits(self, arr: List[int]) -> List[int]:
        def sort_weight(num):
            weight = 0

            while num:
                weight += 1
                num &= (num-1)
            
            return weight

        arr.sort(key = lambda num: (sort_weight(num), num))
        return arr