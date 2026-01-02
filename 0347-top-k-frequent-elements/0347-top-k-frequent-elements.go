func topKFrequent(nums []int, k int) []int {
    hash := make(map[int]int)

    for _, v := range nums {
        if _, ok := hash[v]; !ok {
            hash[v] = 1;
        } else {
            hash[v]++;
        }
    }

    keys := make([]int, 0, 10);

    for k := range hash {
        keys = append(keys, k);
    }

    sort.Slice(keys, func (i, j int) bool {
        return hash[keys[i]] > hash[keys[j]]
    })

    ans := []int{}

    for i,v := range keys {
        if (i == k){
            break;
        }
        ans = append(ans,v);
    }


    return ans;
}