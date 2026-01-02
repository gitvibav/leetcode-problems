func twoSum(nums []int, target int) []int {
    hash := make(map[int]int)

    for i,v := range nums {
        elem, ok := hash[target - v];
        
        if ok {
            return []int{i, elem}
        }

        if _, ok := hash[v]; !ok {
            hash[v] = i;
        }
    }

    return []int{0,0}

}