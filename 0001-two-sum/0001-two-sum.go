func twoSum(nums []int, target int) []int {
    idx := make(map[int]int)

    for k,v := range nums {
        if _, ok := idx[target - v]; !ok {
            idx[v] = k
        } else {
            return []int{k, idx[target-v]}
        }
    }

    return []int{0,0};
}