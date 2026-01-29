func containsDuplicate(nums []int) bool {
    freq := make(map[int]int)

    for _,v := range nums {
        if _,ok := freq[v]; !ok {
            freq[v] = 1
        } else {
            freq[v] += 1
        }
    }

    for _,v := range freq {
        if v > 1 {
            return true
        }
    }

    return false

}