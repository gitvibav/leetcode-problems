class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        elem = set()
        start = 0
        end  = 0
        maxi = 0

        while end < len(s):
            while s[end] in elem:
                elem.remove(s[start])
                start += 1

            elem.add(s[end])
            maxi = max(maxi, end-start+1)
            end += 1

        return maxi