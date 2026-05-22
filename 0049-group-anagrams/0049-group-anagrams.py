class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        hm = {}

        for str1 in strs:
            sorted_str1 = str(sorted(str1))
            if sorted_str1 in hm:
                hm[sorted_str1].append(str1)
            else:
                hm[sorted_str1] = [str1]

        res = []

        for k,v in hm.items():
            res.append(v)
        
        return res