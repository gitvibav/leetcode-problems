func twoSum(nums []int, target int) []int {
    freq := make(map[int]int)

    for k,v := range nums {
        if _, ok := freq[target - v]; ok {
            return []int{freq[target - v], k}
        } else {
            freq[v] = k
        }
    }

    return []int{0,0}
}