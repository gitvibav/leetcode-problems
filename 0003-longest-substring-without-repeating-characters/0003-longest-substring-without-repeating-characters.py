class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        start = 0
        end = 0
        set1 = set()
        maxLen = 0

        while start < len(s):
            while end < len(s) and s[end] not in set1:
                set1.add(s[end])
                end += 1
            set1.remove(s[start])
            start += 1
            maxLen = max(maxLen, end - start + 1) 
        
        return maxLen