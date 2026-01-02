func containsDuplicate(nums []int) bool {
    hash := make(map[int]int)

    for _,v := range nums {
        hash[v]++;
    } 

    for k,v := range hash {
        fmt.Println(k, v)
        if v >= 2 {
            return true;
        }
    }

    return false;
}