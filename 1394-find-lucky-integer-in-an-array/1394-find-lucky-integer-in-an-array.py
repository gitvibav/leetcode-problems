class Solution:
    def findLucky(self, arr: List[int]) -> int:
        a = {}

        for elem in arr:
            if elem not in a:
                a[elem] = 1
            else:
                a[elem] += 1

        maxi = -1
        for k,v in a.items():
            if k == v:
                maxi = max(maxi, k)
        
        return maxi