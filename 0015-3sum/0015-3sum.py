class Solution:
    def threeSum(self, nums: list[int]) -> list[list[int]]:
        res = []
        nums = sorted(nums)
        print(nums)

        for i in range(len(nums)):
            l = i+1
            r = len(nums)-1

            if i>0 and nums[i] == nums[i-1]:
                continue

            while l < r:
                sum1 = nums[i] + nums[l] + nums[r]
                if sum1 == 0:
                    curr = [nums[i], nums[l], nums[r]]
                    res.append(curr)
                    l += 1
                    r -= 1
                    while nums[l] == nums[l-1] and l < r:
                        l += 1
                elif sum1 < 0:
                    l += 1
                else:
                    r -= 1
                      
        return res