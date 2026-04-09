class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        if len(s1) > len(s2):
            return False
            
        h1 = {}
        h2 = {}

        for i in range(len(s1)):
            if s1[i] not in h1:
                h1[s1[i]] = 1
            else:
                h1[s1[i]] += 1

            if s2[i] not in h2:
                h2[s2[i]] = 1
            else:
                h2[s2[i]] += 1

        if h1 == h2:
            return True

        left = 0
        for i in range(len(s1), len(s2)):
            if s2[i] in h2:
                h2[s2[i]] += 1
            else:
                h2[s2[i]] = 1
            
            if s2[left] in h2:
                h2[s2[left]] -= 1

            if h2[s2[left]] == 0:
               del h2[s2[left]]

            if h1 == h2:
                return True
            
            left += 1

        return False

        
