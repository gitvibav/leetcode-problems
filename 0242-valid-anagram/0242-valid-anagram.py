class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        letters = [0] * 26

        for i in s:
            letters[ord(i)-ord('a')] += 1

        for i in t:
            letters[ord(i)-ord('a')] -= 1

        for i in letters:
            if i != 0:
                return False

        return True
