class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        hm = {}

        for s in strs:
            sorted_s = "".join(sorted(s))

            if sorted_s in hm:
                hm[sorted_s].append(s)
            else:
                hm[sorted_s] = [s]

        ans = []
        for k,v in hm.items():
            ans.append(v)

        return ans
