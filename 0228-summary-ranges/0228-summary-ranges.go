func summaryRanges(nums []int) []string {
    var ans []string

    if len(nums) == 0 {
        return ans
    }

    ctr := nums[0]

    for i:=1;i<len(nums);i++ {
        if (nums[i-1] + 1) != nums[i] {
            var ans_str string
            if ctr == nums[i-1] {
                ans_str = fmt.Sprintf("%d", ctr);
            } else {
                ans_str = fmt.Sprintf("%d->%d", ctr, nums[i-1])
            }
            ans = append(ans, ans_str)
            ctr = nums[i] 
        }
    }
    var ans_str string
    if ctr == nums[len(nums)-1] {
        ans_str = fmt.Sprintf("%d", ctr);
    } else {
        ans_str = fmt.Sprintf("%d->%d", ctr, nums[len(nums)-1])
    }
    ans = append(ans, ans_str)

    return ans
}