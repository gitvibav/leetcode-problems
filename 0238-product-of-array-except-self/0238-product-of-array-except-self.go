func productExceptSelf(nums []int) []int {
    n := len(nums)
    ans := make([]int,n)

    pre := 1

    for i:=0; i<n; i++ {
        ans[i] = pre;
        pre *= nums[i];
    }

    pos := 1

    for i:=n-1; i>=0 ;i-- {
        ans[i] *= pos
        pos *= nums[i]
    }

    return ans
}