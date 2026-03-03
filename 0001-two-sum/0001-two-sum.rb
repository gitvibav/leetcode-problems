# @param {Integer[]} nums
# @param {Integer} target
# @return {Integer[]}
def two_sum(nums, target)
    freq = {}
    nums.each_with_index do |num, index|
        if freq[target - num]
            return [freq[target-num],index]
        else
            freq[num] = index
        end
    end
end