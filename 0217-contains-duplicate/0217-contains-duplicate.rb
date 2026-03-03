# @param {Integer[]} nums
# @return {Boolean}
def contains_duplicate(nums)
    freq = nums.tally

    freq.any? {|_,v| v > 1}
end