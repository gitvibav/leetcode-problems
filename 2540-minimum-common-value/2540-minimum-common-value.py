class Solution:
    def getCommon(self, nums1: List[int], nums2: List[int]) -> int:
        hm1 = {}

        set_nums1 = set(nums1)
        set_nums2 = set(nums2)

        for num in set_nums1:
            if num not in hm1:
                hm1[num] = 1
            else:
                hm1[num] += 1

        for num in set_nums2:
            if num not in hm1:
                hm1[num] = 1
            else:
                hm1[num] += 1

        for k,v in sorted(hm1.items()):
            if v >= 2:
                return k

        return -1

        