class Solution:
    def threeSum(self, nums: list[int]) -> list[list[int]]:
        sorted_nums = sorted(nums)

        ans = []

        for i in range(len(sorted_nums)):
            j = i+1
            k = len(sorted_nums) - 1
            
            if i>0 and sorted_nums[i] == sorted_nums[i-1]:
                continue

            while j < k:
                sum1 = sorted_nums[i] + sorted_nums[j] + sorted_nums[k]
                if sum1 == 0:
                    current_ans = [sorted_nums[i], sorted_nums[j], sorted_nums[k]]
                    ans.append(current_ans)
                    j += 1
                    k -= 1
                    while sorted_nums[j] == sorted_nums[j-1] and j<k:
                        j += 1
                elif sum1 < 0:
                    j += 1
                else:
                    k -= 1

        return ans
