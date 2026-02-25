class Solution:
    def findRepeatedDnaSequences(self, s: str) -> List[str]:
        n = len(s)
        count = {}
        left = 0
        res = []

        for right in range(9,n):
            curr = s[left:right+1]
            if curr not in count:
                count[curr] = 1
            else:
                if count[curr] == 1:
                    res.append(curr)
                    count[curr] += 1
            left += 1
        
        return res
