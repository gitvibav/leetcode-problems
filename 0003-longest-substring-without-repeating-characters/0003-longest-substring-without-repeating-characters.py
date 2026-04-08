class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        start = 0
        end = 0
        elems = set()
        maxi = 0

        while start < len(s):
            while end < len(s) and s[end] not in elems:
                elems.add(s[end])
                end += 1
            elems.remove(s[start])
            start += 1
            maxi = max(maxi, end - start + 1)

        return maxi
            